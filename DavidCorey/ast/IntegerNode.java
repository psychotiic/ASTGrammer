package ast;

import visitor.Visitor;

public class IntegerNode extends ASTNode {

  public IntegerNode() {
  }

  /** 
   *  @return the constant
   */
  public int getVal() {
  /* {return=the constant
 }*/

  return 0;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}