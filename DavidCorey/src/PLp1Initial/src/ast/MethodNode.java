package ast;

//import java.util.ArrayList;

public class MethodNode extends ASTNode {
 String name;
 ASTNode params;
 ASTNode body;
 
  public MethodNode() {
  }

  /** 
   *  @return the name
   */
  public String getName() {
    return this.name;
  }

  /** 
   *  @return the params
   */
  public ASTNode getParams() {
      return this.params;
  }

  /** 
   *  @return the body
   */
  public ASTNode getBody() {
    return this.body;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}