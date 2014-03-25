/**
 *
 */
package ast;

import visitor.Visitor;
import util.PLp1Error;

/**
 * @author carr
 *
 */
public class StringNode extends ASTNode {

    public StringNode() {
    }

    public String getString() {
        return label;
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Error {
        return visitor.visit(this);
    }
}
