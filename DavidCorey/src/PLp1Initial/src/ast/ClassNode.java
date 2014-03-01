package ast;

//import java.util.ArrayList;

public class ClassNode extends ASTNode {
  public ClassNode() {
  }

  /** 
   *  @return the name of the class
   */
  public String getName() {
    return this.getLabel(0);
  }

  /** 
   *  @return the variables defined in the class
   */
  public ASTNode getClassVars() {
    return this.getChild(0);
  }

  public ASTNode getConstructor() {
    return this.getChild(1);
  }

  /** 
   *  @return the methods defined in the class
   */
  public ASTNode getMethods() {
    return this.getChild(2);
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}