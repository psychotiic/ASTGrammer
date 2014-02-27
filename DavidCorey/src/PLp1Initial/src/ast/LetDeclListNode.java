package ast;

import java.util.List;

public class LetDeclListNode extends ASTNode {
    List<ASTNode> decls;

  public LetDeclListNode() {
  }

  public List getDecls() {
  return this.decls;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}