package ast;

public class VarDefNode extends ASTNode {

  public VarDefNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}