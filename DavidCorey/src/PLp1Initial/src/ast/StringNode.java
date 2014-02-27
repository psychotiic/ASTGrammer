package ast;


public class StringNode extends ASTNode {
    String value;

  public StringNode() {
  }

  public String getString() {
  return this.value;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}