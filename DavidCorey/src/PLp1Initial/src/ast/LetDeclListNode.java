package ast;

import java.util.List;

public class LetDeclListNode extends ASTNode {

  public LetDeclListNode() {
  }

  public List<ASTNode> getDecls() {
        return this.children;
  }

  @Override
  public Object accept(Visitor visitor) throws PLp1Exception {
        return visitor.visit(this);
  }
}