/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents an assigmnent expression
 * @author carr
 *
 */
public class AssignNode extends ASTNode{
	
	public AssignNode() {
	}
	
	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	public Object accept(Visitor v) throws PLp1Error { 
		return v.visit(this); 
	}

	/**
	 * @return the left hand side of an assignment
	 */
	public String getLhs() {
		return getChild(0).getLabel();
	}

	/**
	 * @return the right hand side of an assignment
	 */
	public ASTNode getRhs() {
		return getChild(1);
	}

}
