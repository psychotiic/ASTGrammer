package ast;


public class VarRefNode extends ASTNode {
  public VarRefNode() {
  }

  public String getId() {
    return this.getLabel(0);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}