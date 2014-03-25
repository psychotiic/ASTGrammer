/**
 * 
 */
package ast;

import java.util.ArrayList;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This class represents a name-less function (lambda expression in lisp terms)
 * @author carr
 *
 */
public class LambdaNode extends ASTNode {

	public LambdaNode() {
	}

	/**
	 * @return the formal parameters to the function
	 */
	public ASTNode getParams() {
		return getChild(0);
	}

	/**
	 * @return the body of the function
	 */
	public ASTNode getBody() {
		return getChild(1);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
