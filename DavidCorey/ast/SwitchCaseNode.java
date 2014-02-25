package ast;

import visitor.Visitor;

public class SwitchCaseNode extends ASTNode {

  public SwitchCaseNode() {
  }

  /** 
   *  @return the expression to test for truth
   */
  public ASTNode getTestExpr() {
  /* {return=the expression to test for truth
 }*/

  return null;
  }

  /** 
   *  @return the expression to evaluate if the test is true
   */
  public ASTNode getResultExpr() {
  /* {return=the expression to evaluate if the test is true
 }*/

  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}