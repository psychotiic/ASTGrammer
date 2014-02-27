package ast;

public class IntegerNode extends ASTNode {
  int value;
  
  public IntegerNode() {
  }

  /** 
   *  @return the constant
   */
  public int getVal() {
    return value;
  }
  
  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}