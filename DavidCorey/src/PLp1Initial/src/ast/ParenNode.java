package ast;

public class ParenNode extends ASTNode {
  public ParenNode() {
  }

  public ASTNode getExpr() {
  return this.getChild(0);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}