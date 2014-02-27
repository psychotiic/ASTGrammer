package ast;

public class NullNode extends ASTNode {

  public NullNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}