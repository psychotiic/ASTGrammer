package ast;

import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
  ArrayList<ASTNode> list;
  
  public ListNode() {
  }

  public List getList() {
    return this.list;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}