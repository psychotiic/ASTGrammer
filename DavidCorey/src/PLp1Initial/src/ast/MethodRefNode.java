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
public class MethodRefNode extends ASTNode {

	public MethodRefNode() {
	}

	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return getChild(0).getLabel();
	}

	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return getChild(1).getLabel();
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
