/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import ast.*;
import ast.ASTNodeBuilderFactory;
import ast.ASTNodeBuilderFactory.ASTNodeType;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.PLp1BaseVisitor;
import parser.PLp1Parser;
import parser.PLp1Visitor;

/**
 *
 * @author carr
 */
public class ASTGenerator extends AbstractParseTreeVisitor<ASTNode> implements PLp1Visitor<ASTNode> {

    private ASTNodeBuilderFactory factory = new ASTNodeBuilderFactory();

    @Override
    public ASTNode visitExpression(@NotNull PLp1Parser.ExpressionContext ctx) {

        ASTNode node = null;

        if (ctx.getChildCount() == 3) {
            if (ctx.getChild(1) instanceof TerminalNode) {
                switch (((TerminalNode) ctx.getChild(1)).getSymbol().getType()) {
                    case PLp1Parser.MULT:
                        node = factory.makeASTNodeBuilder(ASTNodeType.MULTIPLY)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.DIV:
                        node = factory.makeASTNodeBuilder(ASTNodeType.DIVIDE)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.ADD:
                        node = factory.makeASTNodeBuilder(ASTNodeType.ADD)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.SUB:
                        node = factory.makeASTNodeBuilder(ASTNodeType.SUB)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.EQ:
                        node = factory.makeASTNodeBuilder(ASTNodeType.EQUAL)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.NE:
                        node = factory.makeASTNodeBuilder(ASTNodeType.NOTEQUAL)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.LT:
                        node = factory.makeASTNodeBuilder(ASTNodeType.LESS)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.LE:
                        node = factory.makeASTNodeBuilder(ASTNodeType.LESSEQUAL)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.GT:
                        node = factory.makeASTNodeBuilder(ASTNodeType.GREATER)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.GE:
                        node = factory.makeASTNodeBuilder(ASTNodeType.GREATEREQUAL)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.OR:
                        node = factory.makeASTNodeBuilder(ASTNodeType.OR)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                    case PLp1Parser.AND:
                        node = factory.makeASTNodeBuilder(ASTNodeType.AND)
                                .addChild(ctx.getChild(0).accept(this))
                                .addChild(ctx.getChild(2).accept(this))
                                .build();
                        break;
                }
            } else {
                node = factory.makeASTNodeBuilder(ASTNodeType.PAREN)
                        .addChild(ctx.getChild(1).accept(this))
                        .build();
            }
        } else if (ctx.getChildCount() == 2) {
            node = factory.makeASTNodeBuilder(ASTNodeType.NOT)
                    .addChild(ctx.getChild(1).accept(this))
                    .build();
        } else if (ctx.getChildCount() == 5) {
            ParseTree t = ctx.getChild(3);

            ASTNodeBuilder callBuilder = factory.makeASTNodeBuilder(ASTNodeType.CALL)
                    .addChild(ctx.getChild(0).accept(this));
            if (t != null) {
                callBuilder = callBuilder.addChild(t.accept(this));
            } else {
                callBuilder = callBuilder.addChild(factory.makeASTNodeBuilder(ASTNodeType.ARGUMENTLIST).build());
            }

            node = callBuilder.build();
        } else {
            node = ctx.getChild(0).accept(this);
        }

        return node;
    }

    @Override
    public ASTNode visitMethods(@NotNull PLp1Parser.MethodsContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.METHODLIST);

        for (ParseTree t : ctx.children) {
            builder.addChild((MethodNode) t.accept(this));
        }

        return builder.build();
    }

    @Override
    public ASTNode visitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.BODY);

        for (ParseTree c : ctx.children) {
            builder.addChild(c.accept(this));
        }

        return builder.build();
    }

    @Override
    public ASTNode visitDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.BODY);

        for (int i = 2; i < ctx.getChildCount(); i++) {
            builder.addChild(ctx.getChild(i).accept(this));
        }

        ASTNode body = builder.build();

        ASTNode test = factory.makeASTNodeBuilder(ASTNodeType.BOOLEAN).addLabel("true").build();

        return factory.makeASTNodeBuilder(ASTNodeType.SWITCHCASE)
                .addChild(test)
                .addChild(body)
                .build();
    }

    @Override
    public ASTNode visitParamList(@NotNull PLp1Parser.ParamListContext ctx) {
        ASTNodeBuilder plBuilder = factory.makeASTNodeBuilder(ASTNodeType.PARAMETERLIST);

        for (TerminalNode t : ctx.ID()) {
            plBuilder.addChild(factory.makeASTNodeBuilder(ASTNodeType.VARDEF)
                    .addLabel(t.getText())
                    .build());
        }

        return plBuilder.build();
    }

    @Override
    public ASTNode visitVarRef(@NotNull PLp1Parser.VarRefContext ctx) {

        ASTNodeBuilder builder = null;
        if (ctx.getChildCount() == 1) {
            builder = factory.makeASTNodeBuilder(ASTNodeType.VARREF)
                    .addLabel(ctx.ID(0).getText());
        } else {
            ASTNode classVarRef = factory.makeASTNodeBuilder(ASTNodeType.VARREF)
                    .addLabel(ctx.ID(0).getText())
                    .build();
            ASTNode methodVarRef = factory.makeASTNodeBuilder(ASTNodeType.VARREF)
                    .addLabel(ctx.ID(1).getText())
                    .build();

            builder = factory.makeASTNodeBuilder(ASTNodeType.METHODREF)
                    .addChild(classVarRef)
                    .addChild(methodVarRef);
        }

        return builder.build();
    }

    @Override
    public ASTNode visitFunction(@NotNull PLp1Parser.FunctionContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.FUNCTIONDEF)
                .addLabel(ctx.ID().getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(6).accept(this))
                .build();
    }

    @Override
    public ASTNode visitLetDecl(@NotNull PLp1Parser.LetDeclContext ctx) {
        ASTNode varDef = factory.makeASTNodeBuilder(ASTNodeType.VARDEF)
                .addLabel(ctx.ID().getSymbol().getText())
                .build();
        return factory.makeASTNodeBuilder(ASTNodeType.LETDECL)
                .addChild(varDef)
                .addChild(ctx.getChild(2).accept(this))
                .build();

    }

    @Override
    public ASTNode visitIfExpr(@NotNull PLp1Parser.IfExprContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.IF)
                .addChild(ctx.getChild(1).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitLetExp(@NotNull PLp1Parser.LetExpContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.LET)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.CREATE)
                .addLabel(ctx.ID().getSymbol().getText())
                .build();
    }

    @Override
    public ASTNode visitClassDefinition(PLp1Parser.ClassDefinitionContext ctx) {

        return factory.makeASTNodeBuilder(ASTNodeType.CLASS)
                .addLabel(ctx.ID().getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(4).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitListExp(PLp1Parser.ListExpContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.LIST);

        if (ctx.getChildCount() > 2) {
            for (int i = 1; i < ctx.getChildCount(); i += 2) {
                builder.addChild(ctx.getChild(i).accept(this));
            }
        }

        return builder.build();
    }

    @Override
    public ASTNode visitLambdaExp(PLp1Parser.LambdaExpContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.LAMBDA)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitSwitchExp(PLp1Parser.SwitchExpContext ctx) {

        return factory.makeASTNodeBuilder(ASTNodeType.SWITCH)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .build();
    }

    @Override
    public ASTNode visitElement(PLp1Parser.ElementContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public ASTNode visitLetDecls(PLp1Parser.LetDeclsContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.LETDECLLIST);
        List<ParseTree> children = ctx.children;

        if (children != null) {
            for (ParseTree t : ctx.children) {
                builder.addChild(t.accept(this));
            }
        }
        return builder.build();
    }

    @Override
    public ASTNode visitInit(PLp1Parser.InitContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.METHOD)
                .addLabel("init")
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitArgumentList(PLp1Parser.ArgumentListContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.ARGUMENTLIST);

        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            builder.addChild(ctx.getChild(i).accept(this));
        }

        return builder.build();
    }

    @Override
    public ASTNode visitVariables(PLp1Parser.VariablesContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.INSTANCEVARLIST);

        for (TerminalNode t : ctx.ID()) {
            builder.addChild(factory.makeASTNodeBuilder(ASTNodeType.VARDEF)
                    .addLabel(t.getText())
                    .build());
        }

        return builder.build();
    }

    @Override
    public ASTNode visitAssignment(PLp1Parser.AssignmentContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.ASSIGN)
                .addChild(factory.makeASTNodeBuilder(ASTNodeType.VARDEF)
                .addLabel(ctx.ID().getText())
                .build())
                .addChild(ctx.getChild(2).accept(this))
                .build();
    }

    @Override
    public ASTNode visitSwitchCase(PLp1Parser.SwitchCaseContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.SWITCHCASE)
                .addChild(ctx.getChild(1).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .build();
    }

    @Override
    public ASTNode visitProgram(PLp1Parser.ProgramContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.PROGRAM);

        for (ParseTree t : ctx.children) {
            builder.addChild(t.accept(this));
        }

        return builder.build();
    }

    @Override
    public ASTNode visitConstantExp(PLp1Parser.ConstantExpContext ctx) {
        ASTNode n = null;

        if (ctx.INTNUM() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.INTEGER)
                    .addLabel(ctx.INTNUM().getText())
                    .build();
        } else if (ctx.FLOATNUM() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.FLOAT)
                    .addLabel(ctx.FLOATNUM().getText())
                    .build();
        } else if (ctx.STRING() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.STRING)
                    .addLabel(ctx.STRING().getText())
                    .build();
        } else if (ctx.NULL() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.NULL)
                    .build();
        } else if (ctx.FALSE() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.BOOLEAN)
                    .addLabel("false")
                    .build();
        } else if (ctx.TRUE() != null) {
            n = factory.makeASTNodeBuilder(ASTNodeType.BOOLEAN)
                    .addLabel("true")
                    .build();
        } else {
            n = ctx.getChild(0).accept(this);
        }
        return n;
    }

    @Override
    public ASTNode visitMethod(PLp1Parser.MethodContext ctx) {
        return factory.makeASTNodeBuilder(ASTNodeType.METHOD)
                .addLabel(ctx.ID().getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(6).accept(this))
                .build();
    }

    @Override
    public ASTNode visitSwitchCases(PLp1Parser.SwitchCasesContext ctx) {
        ASTNodeBuilder builder = factory.makeASTNodeBuilder(ASTNodeType.SWITCHCASELIST);
        for (ParseTree t : ctx.children) {
            builder.addChild(t.accept(this));
        }

        return builder.build();
    }
}
