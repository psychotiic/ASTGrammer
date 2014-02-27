package ast;

import java.util.List;

public class MethodListNode extends ASTNode {
List<ASTNode> methods;

  public MethodListNode() {
  }

  public List getMethods() {
    return this.methods;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}