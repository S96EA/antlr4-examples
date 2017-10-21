grammar Log;

log : (ip STRING INT NEWLINE)* ;

ip : INT '.' INT '.' INT '.' INT ;

STRING : '"' .*? '"' ;
INT : [0-9]+ ;
NEWLINE : '\r'? '\n' ;
WS : [ \t]+ -> skip ;