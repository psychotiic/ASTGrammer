// Generated from parser\PLp1.g4 by ANTLR 4.1

package parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull PLp1Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethods(@NotNull PLp1Parser.MethodsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(@NotNull PLp1Parser.FunctionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(@NotNull PLp1Parser.ClassDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull PLp1Parser.ExpressionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#defaultCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCase(@NotNull PLp1Parser.DefaultCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(@NotNull PLp1Parser.ParamListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#varRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(@NotNull PLp1Parser.VarRefContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#lambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpr(@NotNull PLp1Parser.LambdaExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecl(@NotNull PLp1Parser.LetDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#ifExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(@NotNull PLp1Parser.IfExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(@NotNull PLp1Parser.LetExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#createExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExpr(@NotNull PLp1Parser.CreateExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#listExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExp(@NotNull PLp1Parser.ListExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExpr(@NotNull PLp1Parser.SwitchExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#letDecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetDecls(@NotNull PLp1Parser.LetDeclsContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull PLp1Parser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(@NotNull PLp1Parser.ArgumentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(@NotNull PLp1Parser.VariablesContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull PLp1Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCase(@NotNull PLp1Parser.SwitchCaseContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull PLp1Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#constantExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExp(@NotNull PLp1Parser.ConstantExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(@NotNull PLp1Parser.MethodContext ctx);

	/**
	 * Visit a parse tree produced by {@link PLp1Parser#switchCases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchCases(@NotNull PLp1Parser.SwitchCasesContext ctx);
}