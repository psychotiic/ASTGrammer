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
     * Visit a parse tree produced by {@link CalcParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    public ASTNode visitExpression(@NotNull PLp1Parser.ExpressionContext ctx) {
        return null;
        
        
        /*
        if (ctx.LET() != null) 
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.LET)
                    .addLabel(ctx.ID().getText())
                    .addChild(ctx.getChild(4).accept(this))
                    .addChild(ctx.getChild(8).accept(this))
                    .build();
        else if (ctx.INT() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.NUM)
                    .addLabel(ctx.INT().getSymbol().getText()).build();
        else if (ctx.ID() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.ID)
                    .addLabel(ctx.ID().getSymbol().getText()).build();
        else if (ctx.ADD() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.ADD)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.SUB() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.SUB)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.MULT() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.MUL)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else if (ctx.DIV() != null)
            return factory.makeASTNodeBuilder(ASTNodeBuilderFactory.ASTNodeType.DIV)
                    .addChild(ctx.getChild(0).accept(this))
                    .addChild(ctx.getChild(2).accept(this))
                    .build();
        else
            return null;
            * 
            */
    }

    @Override
    public ASTNode visitProgram(PLp1Parser.ProgramContext ctx) {
        return ctx.getChild(0).accept(this);
    }

    @Override
    public ASTNode visitMethods(PLp1Parser.MethodsContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitFunctionDef(PLp1Parser.FunctionDefContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitClassDef(PLp1Parser.ClassDefContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitExpressionList(PLp1Parser.ExpressionListContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitDefaultCase(PLp1Parser.DefaultCaseContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitParamList(PLp1Parser.ParamListContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitVarRef(PLp1Parser.VarRefContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitLambdaExpr(PLp1Parser.LambdaExprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitLetDecl(PLp1Parser.LetDeclContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitIfExpr(PLp1Parser.IfExprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitLetExpr(PLp1Parser.LetExprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitCreateExpr(PLp1Parser.CreateExprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitListExp(PLp1Parser.ListExpContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitSwitchExpr(PLp1Parser.SwitchExprContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitLetDecls(PLp1Parser.LetDeclsContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitInit(PLp1Parser.InitContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitArgumentList(PLp1Parser.ArgumentListContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitVariables(PLp1Parser.VariablesContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitAssignment(PLp1Parser.AssignmentContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitSwitchCase(PLp1Parser.SwitchCaseContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitConstantExp(PLp1Parser.ConstantExpContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitMethod(PLp1Parser.MethodContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ASTNode visitSwitchCases(PLp1Parser.SwitchCasesContext ctx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
