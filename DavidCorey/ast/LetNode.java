package ast;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import visitor.Visitor;

public class LetNode extends ASTNode {

  List vars;

  List defs;

  public LetNode() {
  }

  public ASTNode getLetVarDecls() {
  return null;
  }

  private void buildVarList() {
  }

  /** 
   *  @return the set of variables defined in this with node
   */
  public List getVariables() {
  /* {return=the set of variables defined in this with node
 }*/

  return null;
  }

  public List getValueExprs() {
  return null;
  }

  /** 
   *  @param var a variable name
   *  @return the defining expression for var
   */
  public ASTNode getValueExpr(String var) {
  /* {param=var a variable name
, return=the defining expression for var
 }*/

  return null;
  }

  /** 
   *  @return the body of the let expression
   */
  public ASTNode getBody() {
  /* {return=the body of the let expression
 }*/

  return null;
  }

  public Object accept(Visitor visitor) {
  return null;
  }

}