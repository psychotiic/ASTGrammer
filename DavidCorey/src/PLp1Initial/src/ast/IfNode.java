package ast;

public class IfNode extends ASTNode {
  ASTNode testExpr;
  ASTNode thenExpr;
  ASTNode elseExpr;
  
  public IfNode() {
  }

  /** 
   *  @return the test expression
   */
  public ASTNode getTestExpr() {
    return this.testExpr;
  }

  /** 
   *  @return the expression to evaluate if test is true
   */
  public ASTNode getThenExpr() {
    return this.thenExpr;
  }

  /** 
   *  @return the expression to evaluate if test if false
   */
  public ASTNode getElseExpr() {
    return this.elseExpr;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}