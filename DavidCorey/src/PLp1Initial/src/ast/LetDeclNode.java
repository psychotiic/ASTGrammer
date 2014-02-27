package ast;


public class LetDeclNode extends ASTNode {
    String var;
    ASTNode valueExpr;

  public LetDeclNode() {
  }

  public String getVar() {
    return this.var;
  }

  public ASTNode getValueExpr() {
    return this.valueExpr;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}