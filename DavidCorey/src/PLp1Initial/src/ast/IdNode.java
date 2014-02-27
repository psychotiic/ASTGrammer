/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Carr
 */
public class IdNode extends ASTNode {
    
    public IdNode() {}

    @Override
    public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
    }
    
    public String getName() { return getLabel(); }
    
}
