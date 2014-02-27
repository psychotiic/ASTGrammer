package ast;

//import java.util.ArrayList;

public class FunctionDefinitionNode extends ASTNode {
    String name;
    ASTNode params;
    ASTNode body;
    
  public FunctionDefinitionNode() {
  }

  /** 
   *  @return the name of the function
   */
  public String getName() {
    return this.name;
  }

  /** 
   *  @return the formal parameters to the function
   */
  public ASTNode getParams() {
    return this.params;
  }

  /** 
   *  @return the body of the function
   */
  public ASTNode getBody() {
 return this.body;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}