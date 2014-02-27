/**
 *
 */
package ast;

import ast.ASTNode;
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
     * @return the rightOperand
     */
    public ASTNode getRightOperand() {
        return getChild(1);
    }
    
 }
