/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents and integer constant
 * @author carr
 *
 */
public class IntegerNode extends ASTNode {

	public IntegerNode() {
	}

	/**
	 * @return the constant
	 */
	public int getVal() {
		return Integer.parseInt(label);
	}

	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
