package ast;

import java.util.ArrayList;
import java.util.List;

public class BodyNode extends ASTNode {
  public BodyNode() {
  }

  public List<ASTNode> getBody() {
    return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
    return visitor.visit(this);
  }
}