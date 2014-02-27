/**
 * 
 */
package ast;

/**
 * @author carr
 *
 */
public class NumNode extends ASTNode {

	public NumNode() {
	}

	public Integer getNum() {
		return Integer.parseInt(label);
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Exception {
		return visitor.visit(this);
	}

}
