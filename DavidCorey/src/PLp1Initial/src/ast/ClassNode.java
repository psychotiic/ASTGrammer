/**
 *
 */
package ast;

import java.util.ArrayList;

import visitor.Visitor;

import util.PLp1Error;

/**
 * This class reprsents the definition of a class in L485
 *
 * @author carr
 *
 */
public class ClassNode extends ASTNode {

    public ClassNode() {
    }

    /**
     * @return the name of the class
     */
    public String getName() {
        return getLabel();
    }

    /**
     * @return the variables defined in the class
     */
    public ASTNode getClassVars() {
        return getChild(0);
    }

    public ASTNode getConstructor() {
        return getChild(1);
    }

    /**
     * @return the methods defined in the class
     */
    public ASTNode getMethods() {
        return getChild(2);
    }

    /* (non-Javadoc)
     * @see ast.ASTNode#accept(visitor.Visitor)
     */
    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
}
