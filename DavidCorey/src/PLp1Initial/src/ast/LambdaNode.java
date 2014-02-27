package ast;

//import java.util.ArrayList;

public class LambdaNode extends ASTNode {
    ASTNode params;
    ASTNode body;

  public LambdaNode() {
  }

  /** 
   *  @return the formal parameters to the function
   */
  public ASTNode getParams() {
    return this.params;
  }

  /** 
   *  @return the body of the function
   */
  public ASTNode getBody() {
    return this.body;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}