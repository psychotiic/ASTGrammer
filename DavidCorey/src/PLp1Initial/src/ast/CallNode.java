package ast;

public class CallNode extends ASTNode {
  ASTNode function;
  ASTNode args;
  
  public CallNode() {
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

  /** 
   *  @return the function being called
   */
  public ASTNode getFunc() {
    return this.function;
  }

  /** 
   *  @return the list of arguments to the function
   */
  public ASTNode getArgs() {
    return this.args;
  }

}