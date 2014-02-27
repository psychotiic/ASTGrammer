package ast;

public class AssignNode extends ASTNode {
  public AssignNode() {
      
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
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