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
public class LessNode extends BinaryNode {

	public LessNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
