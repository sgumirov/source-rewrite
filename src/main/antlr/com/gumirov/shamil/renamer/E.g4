grammar E;

@header {
package com.gumirov.shamil.renamer;
}

file: ((def | imports1 | interfaces1 ) WS+? )+ EOF;

interfaces1: 'interface ' name1 WS? body1;

imports1: 'import ' ( (what1 'from ' wherefrom) | wherefrom );

what1: (Name | block) WS?;
wherefrom: SQSTR | DQSTR;
body1: block;

def: 'export ' constR name1 reacttype template? anondef body2;

//defnoparams: 'export ' constR name1 reacttype template anondef body2;

anondef: WS? '=' WS? '(' props? ')' WS? '=>';
props: OPEN_CURLY (~(CLOSE_CURLY | OPEN_CURLY) | props)+ CLOSE_CURLY;
name1: Name;
reacttype: ':' WS? 'React.FC';
template: '<' propname '>';
propname: Name;
constR: 'const ';
body2: block2;
block: OPEN_CURLY (~CLOSE_CURLY | block)* CLOSE_CURLY;
block2: (OPEN_CURLY block2 CLOSE_CURLY | ~(OPEN_CURLY|CLOSE_CURLY) )+;

OPEN_CURLY: '{';
CLOSE_CURLY: '}';
SQSTR : '\'' (~['"] | DQSTR)* '\'';
DQSTR : '"'  (~['"] | SQSTR)* '"';

Name: [a-zA-Z_][a-zA-Z_0-9]*;
FileName: [.a-zA-Z_]+;
WS: [ \t\r\n]+;

FILTER : .+?;
