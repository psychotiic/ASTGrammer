package ast;

//import java.util.List;

public class SwitchNode extends ASTNode {
  SwitchCaseListNode cases;
  ASTNode defaultCase;
  
  public SwitchNode() {
  }

  /** 
   *  @return the clauses
   */
  public SwitchCaseListNode getCases() {
        return this.cases;
  }

  public ASTNode getDefaultCase() {
        return this.defaultCase;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}