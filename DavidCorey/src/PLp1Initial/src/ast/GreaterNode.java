package ast;

public class GreaterNode extends BinaryNode {

  public GreaterNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}