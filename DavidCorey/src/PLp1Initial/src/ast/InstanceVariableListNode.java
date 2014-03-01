package ast;

import java.util.List;

public class InstanceVariableListNode extends ASTNode {
  public InstanceVariableListNode() {
  }

  public List<String> getVars() {
    return this.labels;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}