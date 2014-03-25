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
public class MultiplyNode extends BinaryNode {

	public MultiplyNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
