/**
 * 
 */
package ast;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This class represent a list of values in L485
 * @author carr
 *
 */
public class ListNode extends ASTNode {

	public ListNode() {
	}

        public List<ASTNode> getList() {
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
