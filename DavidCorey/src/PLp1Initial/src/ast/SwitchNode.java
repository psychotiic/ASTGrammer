package ast;

//import java.util.List;

public class SwitchNode extends ASTNode {
  public SwitchNode() {
  }

  /** 
   *  @return the clauses
   */
  public SwitchCaseListNode getCases() {
        return (SwitchCaseListNode) this.getChild(0);
  }

  public ASTNode getDefaultCase() {
        return this.getChild(1);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}