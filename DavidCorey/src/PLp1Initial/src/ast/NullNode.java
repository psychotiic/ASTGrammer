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
public class NullNode extends ASTNode {

    public NullNode() {
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
    
}
