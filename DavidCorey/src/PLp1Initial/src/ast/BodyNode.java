/**
 * 
 */
package ast;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This class represents a sequence of ASTNodes.
 * @author carr
 *
 */
public class BodyNode extends ASTNode {
		
	public BodyNode() {
	}
        
        public List<ASTNode> getBody() {
            return children;
        }
	 
	/* (non-Javadoc)
	 * @see ast.ASTNode#accept(visitor.Visitor)
	 */
	@Override
	public Object accept(Visitor visitor) throws PLp1Error {
		return visitor.visit(this);
	}

}