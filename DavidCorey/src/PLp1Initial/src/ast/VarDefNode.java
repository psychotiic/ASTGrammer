/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import util.PLp1Error;
import visitor.Visitor;

/**
 *
 * @author steve
 */
public class VarDefNode extends ASTNode {

    public VarDefNode() {
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
}
