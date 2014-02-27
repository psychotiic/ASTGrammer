package ast;

public class OrNode extends BinaryNode {

  public OrNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}