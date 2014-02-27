package ast;

public class LessEqualNode extends BinaryNode {

  public LessEqualNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}