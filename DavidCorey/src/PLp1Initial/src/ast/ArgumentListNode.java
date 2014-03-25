/**
 * 
 */
package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This class represent a list of arguments in a function call.
 * 
 * @author carr
 *
 */
public class ArgumentListNode extends ASTNode {

	public ArgumentListNode() {
	}
	
	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}
	
	/**
	 * @return the list of arguments
	 */
	public List<ASTNode> getArguments() {
		return children;
	}

}
