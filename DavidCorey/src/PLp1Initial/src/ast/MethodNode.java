package ast;

//import java.util.ArrayList;

public class MethodNode extends ASTNode {
  public MethodNode() {
  }

  /** 
   *  @return the name
   */
  public String getName() {
    return this.getLabel(0);
  }

  /** 
   *  @return the params
   */
  public ASTNode getParams() {
      return this.getChild(0);
  }

  /** 
   *  @return the body
   */
  public ASTNode getBody() {
    return this.getChild(1);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}