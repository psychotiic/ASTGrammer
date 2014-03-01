/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import parser.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 *
 * @author carr
 */
public class ASTGenerator extends AbstractParseTreeVisitor<ASTNode> implements PLp1Visitor<ASTNode> {

    private ASTNodeBuilderFactory factory = new ASTNodeBuilderFactory();
    /**
     * Visit a parse tree produced by {@link PLp1Parser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    @Override
    public ASTNode visitExpression(@NotNull PLp1Parser.ExpressionContext ctx) {
        if (ctx.INVOKE() != null) {
            // expression INVOKE LP argumentList RP
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.CALL)
                .addChild(ctx.getChild(0).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .build();
        } else if (ctx.assignment() != null) {
            // assignment
            return ctx.getChild(0).accept(this);
        } else if (ctx.constantExp() != null) {
            // constantExp
            return ctx.getChild(0).accept(this);
        } else if (ctx.createExpr() != null) {
            // createExpr
            return ctx.getChild(0).accept(this);
        } else if (ctx.ifExpr() != null) {
            // ifExpr
            return ctx.getChild(0).accept(this);
        } else if (ctx.lambdaExpr() != null) {
            // lambdaExpr
            return ctx.getChild(0).accept(this);
        } else if (ctx.letExpr() != null) {
            // letExpr
            return ctx.getChild(0).accept(this);
        } else if (ctx.switchExpr() != null) {
            // switchExpr
            return ctx.getChild(0).accept(this);
        } else if (ctx.varRef() != null) {
            // varRef
            return ctx.getChild(0).accept(this);
            
        } else if (ctx.AND() != null)
            // expression AND expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.AND)
                .addChild(ctx.getChild(0).accept(this))
                .addChild(ctx.getChild(2).accept(this))
                .build();
        else if (ctx.DIVIDE() != null)
            // expression DIVIDE expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.DIV)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.EQUAL() != null)
            // expression EQUAL expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.EQUAL)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.GREATER() != null)
            // expression GREATER expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.GREATER)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.GREATEREQUAL() != null)
            // expression GREATEREQUAL expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.GTEQUAL)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.LESS() != null)
            // expression LESS expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LESS)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.LESSEQUAL() != null)
            // expression LESSEQUAL expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LTEQUAL)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.MINUS() != null)
            // expression MINUS expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.SUB)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.MULTIPLY() != null)
            // expression MULTIPLY expression
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.MULT)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.NOT() != null)
            // NOT expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.NOT)
                    .addChild(ctx.getChild(1).accept(this))
                    .build();
        else if (ctx.NOTEQUAL() != null)
            // expression NOTEQUAL expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.NOTEQUAL)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.OR() != null)
            // expression OR expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.OR)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.PLUS() != null)
            // expression PLUS expression 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.ADD)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        
        else if (ctx.expression() != null) {
            // LP expression RP
            // done last because ctx.expression() exists in other cases
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.PAREN)
                    .addChild(ctx.getChild(1).accept(this))
                    .build();
        }
        else         
            return null; 
    }

    @Override
    public ASTNode visitProgram(PLp1Parser.ProgramContext ctx) {
        // program : (functionDef | classDef | expression)+;
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.PROGRAM);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            b.addChild(ctx.getChild(i).accept(this));
        }
        return b.build();
    }
    
    
    @Override
    public ASTNode visitMethod(PLp1Parser.MethodContext ctx) {
        // method : METHOD ID LP paramList RP LB expressionList RB;
        
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.METHOD)
                .addLabel(ctx.getChild(1).getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(6).accept(this))
                .build();
    }

    @Override
    public ASTNode visitMethods(PLp1Parser.MethodsContext ctx) {
        // methods : (method)*;
        if (ctx.getChildCount() == 0)
            return null;
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.METHODLIST);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            b.addChild(ctx.getChild(i).accept(this));
        }
        
        return b.build();
    }

    @Override
    public ASTNode visitFunctionDef(PLp1Parser.FunctionDefContext ctx) {
       // functionDef : FUNCTION ID LP paramList RP LB expressionList RB;
       return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.FUNCDEF)
                .addLabel(ctx.getChild(1).getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(6).accept(this))
                .build();
    }

    @Override
    public ASTNode visitClassDef(PLp1Parser.ClassDefContext ctx) {
        // classDef : CLASS ID LB variables init methods RB;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.CLASSDEF)
                .addLabel(ctx.getChild(1).getText())
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(4).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitExpressionList(PLp1Parser.ExpressionListContext ctx) {
        // (expression)+
        // guaranteed to have at least 1 member so no count check is needed
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.EXPLIST);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            b.addChild(ctx.getChild(i).accept(this));
        }
        return b.build();
    }

    @Override
    public ASTNode visitDefaultCase(PLp1Parser.DefaultCaseContext ctx) {
        // defaultCase : DEFAULT COLON expressionList;
        return ctx.getChild(2).accept(this);
    }

    @Override
    public ASTNode visitParamList(PLp1Parser.ParamListContext ctx) {
        // paramList : (ID (COMMA ID)*)?;
        
        if (ctx.getChildCount() == 0)
            return null;
        
        int i = 0;
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.PARAMLIST);
        b.addLabel(ctx.getChild(i).getText());
        
        for (i = 2; i < ctx.getChildCount(); i += 2) {
            b.addLabel(ctx.getChild(i).getText());
        }
        return b.build();
    }

    @Override
    public ASTNode visitVarRef(PLp1Parser.VarRefContext ctx) {
        // varRef : ID ( DOT ID )?;
        // if there is a dot, then this is actually a methodRef
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder( 
            (ctx.DOT() == null ? 
                 ASTNodeBuilderFactory.ASTNodeType.VARREF :
                 ASTNodeBuilderFactory.ASTNodeType.METHODREF
             ) );
        
        b.addLabel(ctx.getChild(0).getText());
        if (ctx.DOT() != null)
            b.addLabel(ctx.getChild(2).getText());
        
        return b.build();
    }

    @Override
    public ASTNode visitLambdaExpr(PLp1Parser.LambdaExprContext ctx) {
        // lambdaExpr : LAMBDA LP paramList RP LB expressionList RB;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LAMBDA)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitLetDecl(PLp1Parser.LetDeclContext ctx) {
        // letDecl : LBK ID expression RBK;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LETDECL)
                .addLabel(ctx.getChild(1).getText())
                .addChild(ctx.getChild(2).accept(this))
                .build();
    }

    @Override
    public ASTNode visitIfExpr(PLp1Parser.IfExprContext ctx) {
        // ifExpr : IF expression THEN expression ELSE expression ENDIF;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.IFEXPR)
                .addChild(ctx.getChild(1).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitLetExpr(PLp1Parser.LetExprContext ctx) {
        // letExpr : LET LP letDecls RP LB expressionList RB;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LETEXPR)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitCreateExpr(PLp1Parser.CreateExprContext ctx) {
        // createExpr : CREATE ID;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.CREATEEXPR)
                .addLabel(ctx.getChild(1).getText())
                .build();
    }

    @Override
    public ASTNode visitListExp(PLp1Parser.ListExpContext ctx) {
        // listExp : LBK ( constantExp ( COMMA constantExp )* )? RBK;
        if (ctx.getChildCount() == 2) // if only LBK and RBK exist
            return null;
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LISTEXPR);
        b.addChild(ctx.getChild(1).accept(this));
        if (ctx.COMMA() != null) {
            for (int i = 3; i < ctx.getChildCount() - 1; i += 2) {
                b.addChild(ctx.getChild(i).accept(this));
            }
        }
        return b.build();
    }

    @Override
    public ASTNode visitSwitchExpr(PLp1Parser.SwitchExprContext ctx) {
        // switchExpr : SWITCH LB switchCases defaultCase RB;
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.SWITCHEXPR)
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .build();
    }

    @Override
    public ASTNode visitLetDecls(PLp1Parser.LetDeclsContext ctx) {
        // letDecls : (letDecl)*;
        if (ctx.getChildCount() == 0)
            return null;
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LETDECLLIST);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            b.addChild(ctx.getChild(i).accept(this));
        }
        
        return b.build();
    }

    @Override
    public ASTNode visitInit(PLp1Parser.InitContext ctx) {
        // init : INIT LP paramList RP LB expressionList RB;
        
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.INIT)
                .addLabel("init")
                .addChild(ctx.getChild(2).accept(this))
                .addChild(ctx.getChild(5).accept(this))
                .build();
    }

    @Override
    public ASTNode visitArgumentList(PLp1Parser.ArgumentListContext ctx) {
        // argumentList: (expression (COMMA expression)* )?;
        
        if (ctx.getChildCount() == 0)
            return null;
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.ARGLIST);
        b.addChild(ctx.getChild(0).accept(this));
        
        if (ctx.COMMA() != null) {
            for (int i = 2; i < ctx.getChildCount(); i += 2) {
                b.addChild(ctx.getChild(i).accept(this));
            }
        }
        
        return b.build();
    }

    @Override
    public ASTNode visitVariables(PLp1Parser.VariablesContext ctx) {
        // variables : (ID)*;
        if (ctx.getChildCount() == 0)
            return null;
        
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.VARIABLES);
        for (int i = 0; i < ctx.getChildCount(); i++)
            b.addLabel(ctx.getChild(i).getText());
        
        return b.build();
    }

    @Override
    public ASTNode visitAssignment(PLp1Parser.AssignmentContext ctx) {
        // assignment : ID ASSIGN expression;
        
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.ASSIGN)
                .addLabel(ctx.getChild(0).getText())
                .addChild(ctx.getChild(2).accept(this))
                .build();
    }

    @Override
    public ASTNode visitSwitchCase(PLp1Parser.SwitchCaseContext ctx) {
        // switchCase : CASE expression COLON expressionList;
        
        return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.SWITCHCASE)
                .addChild(ctx.getChild(1).accept(this))
                .addChild(ctx.getChild(3).accept(this))
                .build();
    }

    @Override
    public ASTNode visitSwitchCases(PLp1Parser.SwitchCasesContext ctx) {
        // switchCases : (switchCase)+;
 
        ASTNodeBuilder b = factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.SWITCHCASELIST);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            b.addChild(ctx.getChild(i).accept(this));
        }
        return b.build();
    }

    @Override
    public ASTNode visitConstantExp(PLp1Parser.ConstantExpContext ctx) {
        // constantExp : INTNUM | FLOATNUM | listExp | STRING | TRUE | FALSE | NULL;
        ASTNodeBuilderFactory.ASTNodeType type;
        
        if (ctx.INTNUM() != null)
            type = ASTNodeBuilderFactory.ASTNodeType.INT;
        else if (ctx.FLOATNUM() != null)
            type = ASTNodeBuilderFactory.ASTNodeType.FLOAT;
        else if (ctx.STRING() != null)
            type = ASTNodeBuilderFactory.ASTNodeType.STRING;
        else if (ctx.TRUE() != null || ctx.FALSE() != null)
            type = ASTNodeBuilderFactory.ASTNodeType.BOOLEAN;
        else if (ctx.NULL() != null)
            type = ASTNodeBuilderFactory.ASTNodeType.NULL;
        else // listExp
            return ctx.getChild(0).accept(this);
        
        return factory.makeASTNodeBuilder(type)
                .addLabel(ctx.getChild(0).getText())
                .build();
    }
}
