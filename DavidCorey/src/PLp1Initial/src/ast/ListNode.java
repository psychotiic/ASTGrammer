package ast;

import java.util.ArrayList;
import java.util.List;

public class ListNode extends ASTNode {
  public ListNode() {
  }

  public List<ASTNode> getList() {
    return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}