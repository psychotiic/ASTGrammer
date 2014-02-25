package ast;

import visitor.Visitor;

public class IfNode extends ASTNode {

  public IfNode() {
  }

  /** 
   *  @return the test expression
   */
  public ASTNode getTestExpr() {
  /* {return=the test expression
 }*/

  return null;
  }

  /** 
   *  @return the expression to evaluate if test is true
   */
  public ASTNode getThenExpr() {
  /* {return=the expression to evaluate if test is true
 }*/

  return null;
  }

  /** 
   *  @return the expression to evaluate if test if false
   */
  public ASTNode getElseExpr() {
  /* {return=the expression to evaluate if test if false
 }*/

  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}