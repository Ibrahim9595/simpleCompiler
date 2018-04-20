grammar Hello;

s:
	bool SIMI_COL s			# boolStatement
	| expr SIMI_COL s		# arithStatement
	| control SIMI_COL s	# controlStatement
	| assign SIMI_COL s		# assignStatement
	| out SIMI_COL s		# outStatement
	|						# epsilon;

/////////////////// Arithmatic-Operations ///////////////////////////

expr: expr ADD t # add | expr MINUS t # sub | t # t_eval;

t: t MUL f # mul | t DIV f # div | f # f_eval;

f:
	ID							# exprId
	| NUMBER					# number
	| OPEN_PAR expr CLOSED_PAR	# parExpr;

/////////////////// Binary-Exprissions ///////////////////////////

bool:
	bool OR bool	# or
	| bool AND bool	# and
	| NOT bool		# not
	| expr REL expr	# rel
	| ID			# boolId
	| TRUE			# true
	| FALSE			# false;

/////////////////// Control-Structures /////////////////////////

control:
	IF OPEN_PAR bool CLOSED_PAR OPEN_CURL s CLOSED_CURL									# if
	| IF OPEN_PAR bool CLOSED_PAR OPEN_CURL s CLOSED_CURL ELSE OPEN_CURL s CLOSED_CURL	# ifElse
	| WHILE OPEN_PAR bool CLOSED_PAR OPEN_CURL s CLOSED_CURL							# while;

/////////////////// Assignment ///////////////////////////////

assign: ID EQUAL expr # assigExpr | ID EQUAL bool # assigBool;

/////////////////// Output ///////////////////////////////

out: 'print' OPEN_PAR outputs CLOSED_PAR;
outputs:
	outputs COMA outputs	# concatenatedOutput
	| expr					# exprOutput
	| QOUTES . QOUTES		# stringOutput
	|						# epsilonOutput;

/////////////////// Tokens /////////////////////////////////
COMA: ',';
QOUTES: '"';
SIMI_COL: ';';
OR: '||';
AND: '&&';
NOT: '!';
REL: '>=' | '<=' | '>' | '<' | '==' | '!=';
TRUE: 'true';
FALSE: 'false';
ADD: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
EQUAL: '=';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
OPEN_PAR: '(';
CLOSED_PAR: ')';
OPEN_CURL: '{';
CLOSED_CURL: '}';
ID: [a-zA-Z_][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\n]+ -> skip;