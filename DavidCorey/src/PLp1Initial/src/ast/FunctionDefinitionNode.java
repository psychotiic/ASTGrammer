/**
 * 
 */
package ast;

import java.util.ArrayList;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This node represents a function definition
 * @author carr
 *
 */
public class FunctionDefinitionNode extends ASTNode {

	public FunctionDefinitionNode() {
	}

	/**
	 * @return the name of the function
	 */
	public String getName() {
		return label;
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
