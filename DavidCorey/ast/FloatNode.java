package ast;

import visitor.Visitor;

public class FloatNode extends ASTNode {

  public FloatNode() {
  }

  /** 
   *  @return the constant
   */
  public float getVal() {
  /* {return=the constant
 }*/

  return 0.0;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}