package ast;


public class VarRefNode extends ASTNode {
  String id;

  public VarRefNode() {
  }

  public String getId() {
    return this.id;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}