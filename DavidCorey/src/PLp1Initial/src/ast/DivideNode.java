/**
 * 
 */
package ast;


/**
 * @author carr
 *
 */
public class DivideNode extends BinaryNode {

	public DivideNode() {
		super();
	}

	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(patterns.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Exception {
		return visitor.visit(this);
	}
}
