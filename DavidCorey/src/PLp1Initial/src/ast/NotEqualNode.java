package ast;

public class NotEqualNode extends BinaryNode {

  public NotEqualNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}