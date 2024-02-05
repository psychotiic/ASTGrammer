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
public class InstanceVariableListNode extends ASTNode {
    
    public InstanceVariableListNode() {
     }
    
    public List<ASTNode> getVars() {
        return children;
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
}
