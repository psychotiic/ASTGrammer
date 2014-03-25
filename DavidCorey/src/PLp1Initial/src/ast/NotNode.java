/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * @author carr
 *
 */
public class NotNode extends ASTNode {

	public NotNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
	/**
	 * @return the operand
	 */
	public ASTNode getOperand() {
		return getChild(0);
	}

}
