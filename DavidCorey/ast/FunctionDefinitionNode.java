package ast;

import java.util.ArrayList;
import visitor.Visitor;

public class FunctionDefinitionNode extends ASTNode {

  public FunctionDefinitionNode() {
  }

  /** 
   *  @return the name of the function
   */
  public String getName() {
  /* {return=the name of the function
 }*/

  return null;
  }

  /** 
   *  @return the formal parameters to the function
   */
  public ASTNode getParams() {
  /* {return=the formal parameters to the function
 }*/

  return null;
  }

  /** 
   *  @return the body of the function
   */
  public ASTNode getBody() {
  /* {return=the body of the function
 }*/

  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}