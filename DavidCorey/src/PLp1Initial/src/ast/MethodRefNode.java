package ast;

public class MethodRefNode extends ASTNode {
  public MethodRefNode() {
  }

  /** 
   *  @return the objectName
   */
  public String getObjectName() {
    return this.getLabel(0);
  }

  /** 
   *  @return the methodName
   */
  public String getMethodName() {
        return this.getLabel(1);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}