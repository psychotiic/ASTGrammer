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
        ADD, AND, ARGLIST, ASSIGN, BODY, BOOLEAN, CALL, CLASSDEF,
        CREATEEXPR, DIV, EQUAL, EXPLIST, FLOAT, FUNCDEF, GTEQUAL, GREATER,
        IFEXPR, INIT, INT, LAMBDA, LTEQUAL, LESS, 
        LETDECL, LETDECLLIST, LETEXPR, LISTEXPR, METHODLIST, METHOD, METHODREF,
        MULT, NOTEQUAL, NOT, NULL, OR, PARAMLIST, PAREN,
        PROGRAM, STRING, SUB, SWITCHCASELIST, SWITCHCASE, SWITCHEXPR,
        VARDEF, VARREF, VARIABLES,
    };
    
    public ASTNodeBuilder makeASTNodeBuilder(ASTNodeType nodeType) {
        return new ASTNodeBuilder(nodeType);
    }
}
