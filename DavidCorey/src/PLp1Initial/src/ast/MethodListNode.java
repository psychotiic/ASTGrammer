package ast;

import java.util.List;

public class MethodListNode extends ASTNode {

  public MethodListNode() {
  }

  public List<ASTNode> getMethods() {
    return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}