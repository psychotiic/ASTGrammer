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
                case AND:
                    node = new AndNode();
                    break;
                case ARGLIST:
                    node = new ArgumentListNode();
                    break;
                case ASSIGN:
                    node = new AssignNode();
                    break;
                case BODY:
                    node = new BodyNode();
                    break;
                case BOOLEAN:
                    node = new BooleanNode();
                    break;
                case CALL:
                    node = new CallNode();
                    break;
                case CLASSDEF:
                    node = new ClassNode();
                    break;
                case CREATEEXPR:
                    node = new CreateNode();
                    break;
                case DIV:
                    node = new DivideNode();
                    break;
                case EQUAL:
                    node = new EqualNode();
                    break;
                case FLOAT:
                    node = new FloatNode();
                    break;
                case INIT: // init node is just a function named init()
                case FUNCDEF:
                    node = new FunctionDefinitionNode();
                    break;
                case GTEQUAL:
                    node = new GreaterEqualNode();
                    break;
                case GREATER:
                    node = new GreaterNode();
                    break;
                case IFEXPR:
                    node = new IfNode();
                    break;

                case INT:
                    node = new IntegerNode();
                    break;
                case LAMBDA:
                    node = new LambdaNode();
                    break;
                case LTEQUAL:
                    node = new LessEqualNode();
                    break;
                case LESS:
                    node = new LessNode();
                    break;
                case LETDECL:
                    node = new LetDeclNode();
                    break;
                case LETDECLLIST:
                    node = new LetDeclListNode();
                    break;
                case LETEXPR:
                    node = new LetNode();
                    break;
                case LISTEXPR:
                    node = new ListNode();
                    break;
                case METHODLIST:
                    node = new MethodListNode();
                    break;
                case METHOD:
                    node = new MethodNode();
                    break;
                case METHODREF:
                    node = new MethodRefNode();
                    break;
                case MULT:
                    node = new MultiplyNode();
                    break;
                case NOTEQUAL:
                    node = new NotEqualNode();
                    break;
                case NOT:
                    node = new NotNode();
                    break;
                case NULL:
                    node = new NullNode();
                    break;
                case OR:
                    node = new OrNode();
                    break;
                case PAREN:
                    node = new ParenNode();
                    break;
                case PARAMLIST:
                    node = new ParameterListNode();
                    break;
                case PROGRAM:
                    node = new ProgramNode();
                    break;
                case STRING:
                    node = new StringNode();
                    break;
                case SUB:
                    node = new SubNode();
                    break;
                case SWITCHCASELIST:
                    node = new SwitchCaseListNode();
                    break;
                case SWITCHEXPR:
                    node = new SwitchNode();
                    break;
                case SWITCHCASE:
                    node = new SwitchCaseNode();
                    break;
                case VARDEF:
                    node = new VarDefNode();
                    break;
                case VARREF:
                    node = new VarRefNode();
                    break;
                case EXPLIST:
                    node = new BodyNode();
                    break;
                case VARIABLES:
                    node = new InstanceVariableListNode();
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
