package ast;

//import java.util.ArrayList;

public class FunctionDefinitionNode extends ASTNode {
  public FunctionDefinitionNode() {
  }

  /** 
   *  @return the name of the function
   */
  public String getName() {
    return this.getLabel(0);
  }

  /** 
   *  @return the formal parameters to the function
   */
  public ASTNode getParams() {
    return this.getChild(0);
  }

  /** 
   *  @return the body of the function
   */
  public ASTNode getBody() {
 return this.getChild(1);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}