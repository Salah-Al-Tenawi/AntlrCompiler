parser grammar myLanguageParsser;
options {tokenVocab = myLanguagelexer ;}

imports :  IMPORT LBRACE ID RBRACE FROM STRING SEMICOLN ;
file : (interfaceDeclaration|componentDeclration |classDeclaration )*;
interfaceDeclaration : INTERFACE ID LBRACE interfaceField+ RBRACE ;
interfaceField : ID COLON type SEMICOLN ;
// component
componentDeclration: AT_SYMBOL COMPONENT LPAREN componentConfig RPAREN ;

componentConfig: LBRACE configField (COMMA configField)* RBRACE;
configField
    :SELECTOR COLON STRING
    | STANDALONE COLON BOOLEAN
    | IMPORTS COLON arrayValue
    | TEMPLATE COLON templateBody COMA
    | style
    ;
templateBody :;
style : ;

//class
classDeclaration : EXPORT CLASS ID classbody;
classbody : LBRACE classmember* RBRACE ;
classmember : variableDeclartion | functionDeclartion ;
variableDeclartion : ID COLON type  SEMI;
functionDeclartion : ID LPAREN functionParameters? RLPAREN COLON type functionBody;
functionParameters : functionParameter (COLON functionParameter)*;
functionParameter : ID COLON type ;
functionBody: LBRACE statement* RBRACE ;
statement: variableDeclartion| expression SEMI;
// تعريف المصفوفات
array
    : LBRACKET (expression (COMMA expression)*)? RBRACKET
    ;

// تعريف التعبيرات
expression
    : literal
    | ID
    | array
    |assignmentExpression
    ;

assignmentExpression
    : ID EQUAL expression
    | objectMember EQUAL expression
    ;

objectMember
    : THIS DOT ID
    ;

literal
    : STRING
    | NUMBER
    | BOOLEAN
    | NULL
    ;
//statement : variableDeclartion | expression SEMI ;




type: STRING_TYPE| NUMBER_TYPE| BOOLEAN_TYPE| ANY_TYPE| ID;

arrayValue: LBRACKET (ID*)? RBRACKET  ;

