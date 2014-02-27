package ast;

public class MethodRefNode extends ASTNode {
    String objectName;
    String methodName;

  public MethodRefNode() {
  }

  /** 
   *  @return the objectName
   */
  public String getObjectName() {
    return this.objectName;
  }

  /** 
   *  @return the methodName
   */
  public String getMethodName() {
        return this.methodName;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}