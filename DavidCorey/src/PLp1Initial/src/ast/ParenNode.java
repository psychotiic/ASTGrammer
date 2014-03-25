/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import util.PLp1Error;
import visitor.Visitor;

/**
 *
 * @author carr
 */
public class ParenNode extends ASTNode {
    
    public ParenNode() {
    }

    public ASTNode getExpr() {
        return getChild(0);
    }
    
    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
}
