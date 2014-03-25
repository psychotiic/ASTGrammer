/**
 * 
 */
package ast;

import java.util.ArrayList;

import visitor.Visitor;

import util.PLp1Error;

/**
 * @author carr
 *
 */
public class MethodNode extends ASTNode {

	public MethodNode() {
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return label;
	}

	/**
	 * @return the params
	 */
	public ASTNode getParams() {
		return getChild(0);
	}

	/**
	 * @return the body
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
