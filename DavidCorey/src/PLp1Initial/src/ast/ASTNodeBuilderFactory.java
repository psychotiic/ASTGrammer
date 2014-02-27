/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author steve
 */
public class ASTNodeBuilderFactory {

    public static enum ASTNodeType {
        ADD, AND, ARGLIST, ASSIGN, BODY, BOOLEAN, CALL, CLASS,
        CREATE, DIV, EQUAL, FLOAT, FUNCDEF, GTEQUAL, GREATER,
        ID, IF, INSTVARLIST, INT, LAMBDA, LTEQUAL, LESS, LETDECL,
        LETDECLLIST, LET, LIST, METHODLIST, METHOD, METHODREF,
        MULT, NOTEQUAL, NOT, NULL, NUM, OR, PARAMLIST, PAREN,
        PROGRAM, STRING, SUB, SWITCHCASELIST, SWITCHCASE, SWITCH,
        VARDEF, VARREF
    };
    
    public ASTNodeBuilder makeASTNodeBuilder(ASTNodeType nodeType) {
        return new ASTNodeBuilder(nodeType);
    }
}
