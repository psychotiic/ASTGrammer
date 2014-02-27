/**
 * 
 */
package ast;

/**
 * @author carr
 *
 */
public class SubNode extends BinaryNode {

	public SubNode() {
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Exception {
		return visitor.visit(this);
	}

}
