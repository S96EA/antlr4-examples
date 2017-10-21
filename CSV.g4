grammar CSV;

file : header line+ ;

header : line ;

line : field (',' field)* '\r'? '\n' ;

field : TEXT | STRING ;

TEXT : ~[\r\n,"]+ ;
STRING : '"' ('""'|~'"')* '"';
