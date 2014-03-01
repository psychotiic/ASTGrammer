package ast;

import java.util.List;

public class SwitchCaseListNode extends ASTNode {
  public SwitchCaseListNode() {
  }

  public List<ASTNode> getSwitchCases() {
    return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}