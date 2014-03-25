package ast;
import visitor.Visitor;
import util.PLp1Error;

/**
 * 
 */

/**
 * This class represents a floating-point constant
 * @author carr
 *
 */
public class FloatNode extends ASTNode {

	public FloatNode() {
	}

	/**
	 * @return the constant
	 */
	public float getVal() {
		return Float.parseFloat(label);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
