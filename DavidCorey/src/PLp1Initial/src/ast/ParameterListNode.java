package ast;

import java.util.List;

public class ParameterListNode extends ASTNode {
  List<ASTNode> idList;
  public ParameterListNode() {
  }

  public List getIdList() {
  return this.idList;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}