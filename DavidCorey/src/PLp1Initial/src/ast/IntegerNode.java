package ast;

public class IntegerNode extends ASTNode {
  public IntegerNode() {
  }

  /** 
   *  @return the constant
   */
  public int getVal() {
    return Integer.parseInt(this.getLabel(0));
  }
  
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}