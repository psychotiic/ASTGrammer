package ast;

public class EqualNode extends BinaryNode {

  public EqualNode() {
  }

  @Override
  public Object accept(ast.Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}