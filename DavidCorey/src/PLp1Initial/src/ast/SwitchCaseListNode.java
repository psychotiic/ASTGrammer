/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.LinkedList;
import java.util.List;
import util.PLp1Error;
import visitor.Visitor;

/**
 *
 * @author carr
 */
public class SwitchCaseListNode extends ASTNode {
    
     public SwitchCaseListNode() {
     }
    
    public List<ASTNode> getSwitchCases() {
        return children;
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
    
}
