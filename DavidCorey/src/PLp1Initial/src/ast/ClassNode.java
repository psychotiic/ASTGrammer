package ast;

//import java.util.ArrayList;

public class ClassNode extends ASTNode {
  String name;
  ASTNode classVars;
  ASTNode constructor;
  ASTNode methods;

  public ClassNode() {
  }

  /** 
   *  @return the name of the class
   */
  public String getName() {
    return this.name;
  }

  /** 
   *  @return the variables defined in the class
   */
  public ASTNode getClassVars() {
    return this.classVars;
  }

  public ASTNode getConstructor() {
    return this.constructor;
  }

  /** 
   *  @return the methods defined in the class
   */
  public ASTNode getMethods() {
    return this.methods;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}