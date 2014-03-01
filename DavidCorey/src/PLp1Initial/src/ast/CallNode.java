package ast;

public class CallNode extends ASTNode {
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
    return this.getChild(0);
  }

  /** 
   *  @return the list of arguments to the function
   */
  public ASTNode getArgs() {
    return this.getChild(1);
  }
}