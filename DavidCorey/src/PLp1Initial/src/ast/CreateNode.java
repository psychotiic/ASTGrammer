package ast;

public class CreateNode extends ASTNode {
  String className;
  
  public CreateNode() {
  }

  /** 
   *  @return the className
   */
  public String getClassName() {
    return this.className;
  }
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}