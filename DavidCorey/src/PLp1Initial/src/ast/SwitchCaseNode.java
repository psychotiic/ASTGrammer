package ast;

public class SwitchCaseNode extends ASTNode {
  public SwitchCaseNode() {
  }

  /** 
   *  @return the expression to test for truth
   */
  public ASTNode getTestExpr() {
      return this.getChild(0);
  }

  /** 
   *  @return the expression to evaluate if the test is true
   */
  public ASTNode getResultExpr() {
    return this.getChild(1);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}