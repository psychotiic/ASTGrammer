package ast;

public class FloatNode extends ASTNode {
  public FloatNode() {
  }

  /** 
   *  @return the constant
   */
  public float getVal() {
    return Float.valueOf(getLabel(0));
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}