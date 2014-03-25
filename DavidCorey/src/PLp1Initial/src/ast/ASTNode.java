/**
 *
 */
package ast;

import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;
import visitor.Visitor;
import util.PLp1Error;

/**
 * @author carr
 *
 */
public abstract class ASTNode {

    protected String label;
    protected List<ASTNode> children;

    protected ASTNode() {
        children = new LinkedList<>();
    }

    public ASTNode getChild(int i) {
        return children.get(i);
    }

    public void addChild(ASTNode node) {
        children.add(node);
    }

    public void pushChild(ASTNode node) {
        children.add(0, node);
    }

    public void setChild(int i, ASTNode node) {
        children.set(i, node);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
    public abstract Object accept(Visitor visitor) throws PLp1Error;
}
