package ast;

import java.util.ArrayList;
import java.util.List;

public class BodyNode extends ASTNode {
  ArrayList<ASTNode> body;

  public BodyNode() {
  }

  public List getBody() {
    return this.body;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
    return visitor.visit(this);
  }
}