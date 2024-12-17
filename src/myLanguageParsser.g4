parser grammar myLanguageParsser;
options {tokenVocab = myLanguagelexer ;}

imports :  IMPORT LBRACE ID RBRACE FROM STRING SEMICOLN ;
interface : INTERFACE ID LBRACE interfaceProperty+ RBRACE ;
interfaceProperty : ID COLON type SEMICOLN ;
type: STRING_TYPE| NUMBER_TYPE| BOOLEAN_TYPE| ANY_TYPE;