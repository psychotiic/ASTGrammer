/**
 *
 */
package ast;

import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * @author carr
 *
 */
public abstract class ASTNode {

    protected List<String> labels;
    protected List<ASTNode> children;

    protected ASTNode() {
        children = new LinkedList<>();
        labels = new LinkedList<>();
    }

    public ASTNode getChild(int i) {
        return children.get(i);
    }

    public void addChild(ASTNode node) {
        children.add(node);
    }

    public String getLabel(int i) {
        return labels.get(i);
    }

    public void addLabel(String label) {
        labels.add(label);
    }

    /**
     * This is the accept method for the visitor pattern. It has been modified
     * to return a value to allow the implementation of an interpreter. The
     * modified visitor pattern was used so that the interpreter is not spread
     * over all of the AST files as would be the case using an interpreter
     * pattern.
     *
     * @param visitor - a visitor for an AST
     * @return an Object
     * @throws PLp1Error TODO
     */
    public abstract Object accept(Visitor visitor) throws PLp1Exception;
}
