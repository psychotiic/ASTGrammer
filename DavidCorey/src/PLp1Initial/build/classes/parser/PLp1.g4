/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
grammar PLp1;

@header {
package parser;
}

//program : ID;
program : (functionDef | classDef | expression)+;
                    
                  
fragment                
ALPHA : [a-zA-Z]
      ;

fragment
DIGIT : [0-9]
      ;


fragment
POSITIVE : [1-9]
         ;

INTNUM : (POSITIVE DIGIT* | '0')
       ;

fragment
EXPONENT : ('e' | 'E') ('+' | '-')? DIGIT+
         ;

FLOATNUM : INTNUM '.' DIGIT+ EXPONENT?
         ;

STRING : '\'' ( ~['\''] )* '\''
       ;

NEWLINE : '\r'?'\n' -> skip ;

WS : [ \t]+ -> skip ; 

CLASS : 'class';
CREATE : 'create';
ENDIF : 'endif';
ELSE : 'else';
FALSE : 'false';
FUNCTION : 'function';
IF : 'if';
LAMBDA : 'lambda';
LET : 'let';
METHOD : 'method';
NULL : 'null';
SWITCH : 'switch';
THEN : 'then';
TRUE : 'true';

DEFAULT : 'default';
INIT : 'init';
CASE : 'case';

RB : '}';
LB : '{';
COLON : ':';
RP : ')';

AND : '&';
ASSIGN : '=';
COMMA : ',';
DIVIDE : '/';
DOT : '.';
EQUAL : '==';
GREATER : '>';
GREATEREQUAL : '>=';
INVOKE : '->';
LBK : '[';
LESS : '<';
LESSEQUAL : '<=';
LP : '(';
MINUS : '-';
MULTIPLY : '*';
NOT : '!';
NOTEQUAL : '!=';
OR : '|';
PLUS : '+';

RBK : ']';



ID : ALPHA (ALPHA | DIGIT)*;

functionDef : FUNCTION ID LP paramList RP LB expressionList RB;

paramList : (ID (COMMA ID)*)?;

classDef : CLASS ID LB variables init methods RB;

variables : (ID)*;

init : INIT LP paramList RP LB expressionList RB;

methods : (method)*;

method : METHOD ID LP paramList RP LB expressionList RB;

expressionList : (expression)+;

expression : expression MULTIPLY expression
           | expression DIVIDE expression 
           | expression PLUS expression 
           | expression MINUS expression 
           | expression EQUAL expression 
           | expression NOTEQUAL expression 
           | expression LESS expression 
           | expression LESSEQUAL expression 
           | expression GREATER expression 
           | expression GREATEREQUAL expression 
           | expression OR expression 
           | expression AND expression 
           | NOT expression 
           | varRef | constantExp | createExpr | ifExpr
           | lambdaExpr | assignment | switchExpr
           | letExpr | LP expression RP
           | expression INVOKE LP argumentList RP;

varRef : ID ( DOT ID )?;

constantExp : INTNUM | FLOATNUM | listExp | STRING | TRUE | FALSE | NULL;

listExp : LBK ( constantExp ( COMMA constantExp )* )? RBK;

createExpr : CREATE ID;

ifExpr : IF expression THEN expression ELSE expression ENDIF;

lambdaExpr : LAMBDA LP paramList RP LB expressionList RB;

assignment : ID ASSIGN expression;

switchExpr : SWITCH LB switchCases defaultCase RB;

switchCases : (switchCase)+;

switchCase : CASE expression COLON expressionList;

defaultCase : DEFAULT COLON expressionList;

letExpr : LET LP letDecls RP LB expressionList RB;

letDecls : (letDecl)*;

letDecl : LBK ID expression RBK;

argumentList: (expression (COMMA expression)* )?;