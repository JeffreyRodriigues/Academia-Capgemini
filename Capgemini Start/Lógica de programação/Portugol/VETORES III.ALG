Algoritmo "Vetores III"
// Descrição   : Testes
// Autor(a)    : Jeffrey
// Data atual  : 15/03/2022
Var
numeros1, numeros2, numeros3: vetor[1..5] de inteiro
i, aux: inteiro
opcao: caractere
Inicio

para i de 1 ate 5 faca
     escreval("1- Numero ",i)
     leia(numeros1[i])
fimpara

para i de 1 ate 5 faca
     escreval("2- Numero ",i)
     leia(numeros2[i])
fimpara

escreval("1 - Soma")
escreval("2 - Subtracao")
leia(opcao)

se opcao = "1" entao
   para i de 1 ate 5 faca
     numeros3[i] <- numeros1[i] + numeros2[i]
fimpara
senao
se opcao = "2" entao
   para i de 1 ate 5 faca
     numeros3[i] <- numeros1[i] - numeros2[i]
fimpara
fimse
fimse

Fimalgoritmo