package ast;

import java.util.List;

public class ParameterListNode extends ASTNode {
  public ParameterListNode() {
  }

  public List<String> getIdList() {
    return this.labels;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}