package ast;

public class BooleanNode extends ASTNode {
  boolean value;

  public BooleanNode() {
  }

  public boolean getVal() {
    return value;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
    return visitor.visit(this);
  }
}