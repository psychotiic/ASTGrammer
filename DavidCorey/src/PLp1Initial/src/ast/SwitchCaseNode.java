package ast;

public class SwitchCaseNode extends ASTNode {
  ASTNode testExpr;
  ASTNode resultExpr;
  
  public SwitchCaseNode() {
  }

  /** 
   *  @return the expression to test for truth
   */
  public ASTNode getTestExpr() {
      return this.testExpr;
  }

  /** 
   *  @return the expression to evaluate if the test is true
   */
  public ASTNode getResultExpr() {
    return this.resultExpr;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}