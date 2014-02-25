package ast;

import visitor.Visitor;

public class NullNode extends ASTNode {

  public NullNode() {
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}