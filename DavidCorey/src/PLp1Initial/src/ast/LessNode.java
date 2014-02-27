package ast;

public class LessNode extends BinaryNode {

  public LessNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}