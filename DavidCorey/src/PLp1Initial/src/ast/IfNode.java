/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class repsresents an if-expression
 * @author carr
 *
 */
public class IfNode extends ASTNode {

	public IfNode() {
	}

	/**
	 * @return the test expression
	 */
	public ASTNode getTestExpr() {
		return getChild(0);
	}

	/**
	 * @return the expression to evaluate if test is true
	 */
	public ASTNode getThenExpr() {
		return getChild(1);
	}

	/**
	 * @return the expression to evaluate if test if false
	 */
	public ASTNode getElseExpr() {
		return getChild(2);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
