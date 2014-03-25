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
public class GreaterEqualNode extends BinaryNode {

	public GreaterEqualNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
