package ast;

public class CreateNode extends ASTNode {
  public CreateNode() {
  }

  /** 
   *  @return the className
   */
  public String getClassName() {
    return getLabel(0);
  }
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}