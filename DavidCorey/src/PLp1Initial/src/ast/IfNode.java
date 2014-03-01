package ast;

public class IfNode extends ASTNode {
  public IfNode() {
  }

  /** 
   *  @return the test expression
   */
  public ASTNode getTestExpr() {
    return this.getChild(0);
  }

  /** 
   *  @return the expression to evaluate if test is true
   */
  public ASTNode getThenExpr() {
    return this.getChild(1);
  }

  /** 
   *  @return the expression to evaluate if test if false
   */
  public ASTNode getElseExpr() {
    return this.getChild(2);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}