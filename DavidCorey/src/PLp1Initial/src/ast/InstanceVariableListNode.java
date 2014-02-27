package ast;

import java.util.List;

public class InstanceVariableListNode extends ASTNode {
  List<ASTNode> vars;
  
  public InstanceVariableListNode() {
  }

  public List getVars() {
  return this.vars;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }

}