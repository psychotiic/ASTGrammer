/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author Carr
 */
public class LetNode extends ASTNode {

    public LetNode() {
        
    }
    @Override
    public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
    }
    
    public String getVar() {
        return getLabel();
    }
    
    public ASTNode getDefinition() {
        return getChild(0);
    }
    
    public ASTNode getBody() {
        return getChild(1);
}
    
}
