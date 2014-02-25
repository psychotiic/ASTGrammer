package ast;

import java.util.ArrayList;
import visitor.Visitor;

public class ClassNode extends ASTNode {

  public ClassNode() {
  }

  /** 
   *  @return the name of the class
   */
  public String getName() {
  /* {return=the name of the class
 }*/

  return null;
  }

  /** 
   *  @return the variables defined in the class
   */
  public ASTNode getClassVars() {
  /* {return=the variables defined in the class
 }*/

  return null;
  }

  public ASTNode getConstructor() {
  return null;
  }

  /** 
   *  @return the methods defined in the class
   */
  public ASTNode getMethods() {
  /* {return=the methods defined in the class
 }*/

  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}