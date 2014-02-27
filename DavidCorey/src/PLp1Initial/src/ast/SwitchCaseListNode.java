package ast;

import java.util.List;

public class SwitchCaseListNode extends ASTNode {
    List<ASTNode> switchCases;

  public SwitchCaseListNode() {
  }

  public List getSwitchCases() {
    return this.switchCases;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}