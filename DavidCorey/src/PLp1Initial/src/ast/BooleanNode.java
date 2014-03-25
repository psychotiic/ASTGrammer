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
public class BooleanNode extends ASTNode {

	public BooleanNode() {
	}

	/**
	 * @return the constant
	 */
	public boolean getVal() {
		return getLabel().equals("true");
	}

	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
