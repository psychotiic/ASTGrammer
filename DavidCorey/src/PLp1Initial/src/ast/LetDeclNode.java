package ast;


public class LetDeclNode extends ASTNode {
  public LetDeclNode() {
  }

  public String getVar() {
    return this.getLabel(0);
  }

  public ASTNode getValueExpr() {
    return this.getChild(0);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}