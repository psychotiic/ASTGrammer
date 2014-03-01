package ast;

public class NotNode extends ASTNode {
  public NotNode() {
  }
  
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

  /** 
   *  @return the operand
   */
  public ASTNode getOperand() {
    return this.getChild(0);
  }
}