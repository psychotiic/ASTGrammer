package ast;

import visitor.Visitor;

public class CallNode extends ASTNode {

  public CallNode() {
  }

  public Object accept(Visitor visitor) {
  return null;
  }

  /** 
   *  @return the function being called
   */
  public ASTNode getFunc() {
  /* {return=the function being called
 }*/

  return null;
  }

  /** 
   *  @return the list of arguments to the function
   */
  public ASTNode getArgs() {
  /* {return=the list of arguments to the function
 }*/

  return null;
  }

}