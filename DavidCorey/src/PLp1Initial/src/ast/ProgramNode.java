package ast;

import java.util.List;

public class ProgramNode extends ASTNode {
  List<ASTNode> program;
  
  public ProgramNode() {
  }

  public List getProgram() {
    return this.program;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}