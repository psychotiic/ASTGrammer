/**
 * 
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * This class represents a clause in a switch expression
 * @author carr
 *
 */
public class SwitchCaseNode extends ASTNode {

	public SwitchCaseNode() {
	}

	/**
	 * @return the expression to test for truth
	 */
	public ASTNode getTestExpr() {
		return getChild(0);
	}

	/**
	 * @return the expression to evaluate if the test is true
	 */
	public ASTNode getResultExpr() {
		return getChild(1);
	}

	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}
