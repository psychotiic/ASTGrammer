// Generated from parser\PLp1.g4 by ANTLR 4.1

package parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLp1Parser}.
 */
public interface PLp1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLp1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PLp1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PLp1Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#methods}.
	 * @param ctx the parse tree
	 */
	void enterMethods(@NotNull PLp1Parser.MethodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#methods}.
	 * @param ctx the parse tree
	 */
	void exitMethods(@NotNull PLp1Parser.MethodsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#defaultCase}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(@NotNull PLp1Parser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(@NotNull PLp1Parser.ParamListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#varRef}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(@NotNull PLp1Parser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#varRef}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(@NotNull PLp1Parser.VarRefContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(@NotNull PLp1Parser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(@NotNull PLp1Parser.FunctionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#letDecl}.
	 * @param ctx the parse tree
	 */
	void enterLetDecl(@NotNull PLp1Parser.LetDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#letDecl}.
	 * @param ctx the parse tree
	 */
	void exitLetDecl(@NotNull PLp1Parser.LetDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(@NotNull PLp1Parser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(@NotNull PLp1Parser.IfExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#letExp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(@NotNull PLp1Parser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#letExp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(@NotNull PLp1Parser.LetExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#createExpr}.
	 * @param ctx the parse tree
	 */
	void enterCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#createExpr}.
	 * @param ctx the parse tree
	 */
	void exitCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(@NotNull PLp1Parser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(@NotNull PLp1Parser.ClassDefinitionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#listExp}.
	 * @param ctx the parse tree
	 */
	void enterListExp(@NotNull PLp1Parser.ListExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#listExp}.
	 * @param ctx the parse tree
	 */
	void exitListExp(@NotNull PLp1Parser.ListExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#lambdaExp}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExp(@NotNull PLp1Parser.LambdaExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#lambdaExp}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExp(@NotNull PLp1Parser.LambdaExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#switchExp}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExp(@NotNull PLp1Parser.SwitchExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#switchExp}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExp(@NotNull PLp1Parser.SwitchExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(@NotNull PLp1Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(@NotNull PLp1Parser.ElementContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#letDecls}.
	 * @param ctx the parse tree
	 */
	void enterLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#letDecls}.
	 * @param ctx the parse tree
	 */
	void exitLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull PLp1Parser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull PLp1Parser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(@NotNull PLp1Parser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(@NotNull PLp1Parser.VariablesContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PLp1Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PLp1Parser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(@NotNull PLp1Parser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(@NotNull PLp1Parser.SwitchCaseContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull PLp1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull PLp1Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#constantExp}.
	 * @param ctx the parse tree
	 */
	void enterConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#constantExp}.
	 * @param ctx the parse tree
	 */
	void exitConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(@NotNull PLp1Parser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(@NotNull PLp1Parser.MethodContext ctx);

	/**
	 * Enter a parse tree produced by {@link PLp1Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(@NotNull PLp1Parser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLp1Parser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(@NotNull PLp1Parser.SwitchCasesContext ctx);
}