package ast;

import java.util.List;
import visitor.Visitor;

public class SwitchNode extends ASTNode {

  public SwitchNode() {
  }

  /** 
   *  @return the clauses
   */
  public SwitchCaseListNode getCases() {
  /* {return=the clauses
 }*/

  return null;
  }

  public ASTNode getDefaultCase() {
  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}