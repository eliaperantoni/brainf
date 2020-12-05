grammar Brainf;

main : prog EOF ;
prog : cmd* ;
cmd  : GREAT # great
     | LESS  # less
     | PLUS  # plus
     | MINUS # minus
     | DOT   # dot
     | COMMA # comma
     | group # group_lab
     ;

group  : LBRAK prog RBRAK ;

GREAT : '>' ;
LESS  : '<' ;
PLUS  : '+' ;
MINUS : '-' ;
DOT   : '.' ;
COMMA : ',' ;
LBRAK : '[' ;
RBRAK : ']' ;

DISCARD : . -> skip ;
