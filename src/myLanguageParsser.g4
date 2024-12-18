parser grammar myLanguageParsser;
options {tokenVocab = myLanguagelexer ;}

imports :  IMPORT LBRACE ID RBRACE FROM STRING SEMICOLN ;
interface : INTERFACE ID LBRACE interfaceProperty+ RBRACE ;
interfaceProperty : ID COLON type SEMICOLN ;
type: STRING_TYPE| NUMBER_TYPE| BOOLEAN_TYPE| ANY_TYPE;

componentDefinition: AT_SYMBOL COMPONENT LPAREN componentConfig RPAREN classDefinition;

componentConfig: LBRACE configField (COMMA configField)* RBRACE;
configField
    :SELECTOR COLON STRING
    | STANDALONE COLON BOOLEAN
    | IMPORTS COLON arrayValue
    | TEMPLATE COLON STRING
    ;

arrayValue: LBRACKET (ID*)? RBRACKET  ;

classDefinition
    : EXPORT CLASS ID LBRACE classbody LBRACE;

    classbody:ID COLON ID LBRACKET RBRACKET EQUAL LBRACKET listbody RBRACKET;
listbody: ;