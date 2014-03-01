package ast;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class LetNode extends ASTNode {
  public LetNode() {
  }

  public ASTNode getLetVarDecls() {
    return getChild(0);
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
      return getChild(1);
  }

  public Object accept(Visitor visitor) throws PLp1Exception {
    return visitor.visit(this);
  }

}