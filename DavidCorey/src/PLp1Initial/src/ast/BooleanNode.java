package ast;

public class BooleanNode extends ASTNode {
  public BooleanNode() {
  }

  public boolean getVal() {
    return Boolean.valueOf(this.getLabel(0));
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
    return visitor.visit(this);
  }
}