package ast;

import java.util.ArrayList;
import java.util.List;

public class ArgumentListNode extends ASTNode {
  public ArgumentListNode() {
  }

  /** 
   *  @return the list of arguments
   */
    public List<ASTNode> getArguments() {
      return this.children;
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
    }
}