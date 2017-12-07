# Analisador de Cálculo de Predicados

### Dependências
- Java 8
- Java Fx

### BNF

```
<sentenca> ::= <sentenca_atomica> | "(" <sentenca> <connective> <sentenca> ")" | <qualificador> <variavel> | <sentenca> | "¬" <sentenca>
<sentenca_atomica> ::= <predicado> "(" <termo> "," <termo> ")" "." | <termo> "=" <termo>
<termo> ::= <expressao_func> | <constant> | <variable>
<expressao_func> ::= <function> "(" <opcao_ef> ")" "."
<opcao_ef> ::= <constant> | <variable> | <opcao_ef> "," <opcao_ef> 
<connective> ::= "&" "&" | "|" "|" | "-" ">" | "<" "-" ">" | "=" "="
<qualificador> ::= "£" | "@"
<variable> ::= <alfa_maiusc> | <alfa_maiusc> <alfanr>
<constant> ::= <alfa_minusc> | <alfa_minusc> <alfanr>
<predicado> ::= <alfa_pz> | <alfa_minusc> <alfanr> | <alfa_minusc> <alfanr>
<function> ::= <alfa_ao> | <alfa_minusc> <alfaunder> | <alfa_ao> <alfaunder>
<alfaunder>	::= <alfanr> | <alfanr> <alfaunder> | "_" <alfaunder>
<alfanr> ::= <alfa_numeric> | <alfa_numeric> <alfanr>
<alfa_numeric> ::= <number> | <alfa_completo> 
<alfa_completo>	::= <alfa_minusc> | <alfa_maiusc>
<alfa_minusc>	::= <alfa_ao> | <alfa_pz>
<alfa_maiusc>	::= <alfa_AO> | <alfa_PZ>
<alfa_ao>	::= a | b | c | ... | o
<alfa_pz>	::= p | q | r | ... | z
<alfa_AO>	::= A | B | C | ... | O
<alfa_PZ>	::= P | Q | R | ... | Z
<number> ::= <digit> | <digit> <number>
<digit> ::= 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9

```
