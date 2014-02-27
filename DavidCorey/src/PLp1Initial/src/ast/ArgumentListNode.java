package ast;

import java.util.ArrayList;
import java.util.List;

public class ArgumentListNode extends ASTNode {
  ArrayList<ASTNode> arguments;
  
  public ArgumentListNode() {
  }

  /** 
   *  @return the list of arguments
   */
    public List getArguments() {
      return this.arguments;
    }

    @Override
    public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
    }
}