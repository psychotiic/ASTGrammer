/**
 *
 */
package ast;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author carr
 *
 */
public abstract class BinaryNode extends ASTNode {
    
    /**
     * @return the leftOperand
     */
    public ASTNode getLeftOperand() {
        return getChild(0);
    }

    /**
     * @param leftOperand the leftOperand to set
     */
    public void setLeftOperand(ASTNode leftOperand) {
        setChild(0, leftOperand);
    }

    /**
     * @return the rightOperand
     */
    public ASTNode getRightOperand() {
        return getChild(1);
    }

    /**
     * @param rightOperand the rightOperand to set
     */
    public void setRightOperand(ASTNode rightOperand) {
        setChild(1,rightOperand);
    }
    
 }
