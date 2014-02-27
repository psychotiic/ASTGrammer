package ast;

public class FloatNode extends ASTNode {
  float value;
  
  public FloatNode() {
  }

  /** 
   *  @return the constant
   */
  public float getVal() {
    return this.value;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}