/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import ast.ASTNodeBuilderFactory.ASTNodeType;
/**
 *
 * @author steve
 */
public class ASTNodeBuilder {
 
        private ASTNode node;
        
        protected ASTNodeBuilder(ASTNodeType nodeType) {

            node = null;

            switch (nodeType) {
                case ADD:
                    node = new AddNode();
                    break;
                case DIV:
                    node = new DivideNode();
                    break;
                case MULT:
                    node = new MultiplyNode();
                    break;
                case SUB:
                    node = new SubNode();
                    break;
                case NUM:
                    node = new NumNode();
                    break;
                case ID:
                    node = new IdNode();
                    break;
                case LET:
                    node = new LetNode();
                    break;
                default:
                    throw new UnsupportedOperationException("Invalid AST Node Type: " + nodeType);
            }

        }

        public ASTNodeBuilder addLabel(String label) {
            node.addLabel(label);
            return this;
        }

        public ASTNodeBuilder addChild(ASTNode child) {
            node.addChild(child);
            return this;
        }
        
        public ASTNode build() {
            return node;
        }

}
