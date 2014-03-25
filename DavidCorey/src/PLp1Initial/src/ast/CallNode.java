/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents a function call
 * @author carr
 *
 */
public class CallNode extends ASTNode {

	public CallNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

	/**
	 * @return the function being called
	 */
	public ASTNode getFunc() {
		return getChild(0);
	}
	
	/**
	 * @return the list of arguments to the function
	 */
	public ASTNode getArgs() {
		return getChild(1);
	}

}
