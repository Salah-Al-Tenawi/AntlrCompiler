lexer grammar myLanguagelexer;
// الكلمات المفتاحية
IMPORT: 'import';
FROM: 'from';
CLASS: 'class';
INTERFACE: 'interface';
COMPONENT: 'Component';
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
TEMPLATE: 'template';
STYLES: 'styles';
CATCH: 'catch';
ERR: 'err';
BOOTSTRAP: 'bootstrapApplication';
 //  type
 STRING_TYPE: 'string';
 NUMBER_TYPE: 'number';
 BOOLEAN_TYPE: 'boolean';
 ANY_TYPE: 'any';

// الرموز
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACKET: '[';
RBRACKET: ']';
DOT: '.';
SEMI: ';';
COMMA: ',';
COLON: ':';
ARROW: '=>';
AT_SYMBOL:'@';
LESS_THAN :'<';
GRET_THAN:'>';



STRING: '"' ( ~["\\] | '\\' . )* '"' | '\'' ( ~['\\] | '\\' . )* '\'';
NUMBER: [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'true' | 'false';
NULL: 'null';

// معرفات
ID: [a-zA-Z_][a-zA-Z_0-9]*;

// مسافات بيضاء وتعليقات
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
MULTI_COMMENT: '/*' .*? '*/' -> skip;
