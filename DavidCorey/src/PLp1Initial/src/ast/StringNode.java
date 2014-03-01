package ast;


public class StringNode extends ASTNode {
  public StringNode() {
  }

  public String getString() {
    return getLabel(0);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}