package ast;

import java.util.List;
import visitor.Visitor;

public abstract class ASTNode {

  protected String label;

  protected List children;

  protected ASTNode() {
  }

  public ASTNode getChild(int i) {
  return null;
  }

  public void addChild(ASTNode node) {
  }

  public void pushChild(ASTNode node) {
  }

  public void setChild(int i, ASTNode node) {
  }

  public String getLabel() {
  return null;
  }

  public void setLabel(String label) {
  }

  /** 
   *   This is the accept method for the visitor pattern. It has been modified
   *   to return a value to allow the implementation of an interpreter. The
   *   modified visitor pattern was used so that the interpreter is not spread
   *   over all of the AST files as would be the case using an interpreter
   *   pattern.
   *  
   *  @param visitor - a visitor for an AST
   *  @return an Object
   *  @throws PLp1Error TODO
   */
  public abstract Object accept(Visitor visitor);
  /* {param=visitor - a visitor for an AST
, return=an Object
, throws=PLp1Error TODO
 }*/


}