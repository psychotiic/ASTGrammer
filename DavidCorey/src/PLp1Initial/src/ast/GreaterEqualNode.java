package ast;

public class GreaterEqualNode extends BinaryNode {

  public GreaterEqualNode() {
  }
  
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}