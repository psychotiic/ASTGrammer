package ast;

import java.util.List;

public class ProgramNode extends ASTNode {
  public ProgramNode() {
  }

  public List<ASTNode> getProgram() {
    return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}