package ast;

import visitor.Visitor;

public class AssignNode extends ASTNode {

  public AssignNode() {
  }

  public Object accept(Visitor v) {
  return null;
  }

  /** 
   *  @return the left hand side of an assignment
   */
  public String getLhs() {
  /* {return=the left hand side of an assignment
 }*/

  return null;
  }

  /** 
   *  @return the right hand side of an assignment
   */
  public ASTNode getRhs() {
  /* {return=the right hand side of an assignment
 }*/

  return null;
  }

}