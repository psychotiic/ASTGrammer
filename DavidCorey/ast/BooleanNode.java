package ast;

import visitor.Visitor;

public class BooleanNode extends ASTNode {

  public BooleanNode() {
  }

  /** 
   *  @return the constant
   */
  public boolean getVal() {
  /* {return=the constant
 }*/

  return false;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}