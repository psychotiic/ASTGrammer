package ast;

public class ParenNode extends ASTNode {
  ASTNode expr;
  
  public ParenNode() {
  }

  public ASTNode getExpr() {
  return this.expr;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}