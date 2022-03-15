Algoritmo "Estruturas Condicionais II"
// Descrição   : Testes
// Autor(a)    : Jeffrey
// Data atual  : 15/03/2022
Var
   nota1, nota2, nota3, media: real
Inicio
      Escreval("Nota 1: ")
      leia(nota1)
      Escreval("Nota 2: ")
      leia(nota2)
      Escreval("Nota 3: ")
      leia(nota3)
      media <- (nota1+nota2+nota3)/3
      
se media >= 7 entao
         Escreval("Você passou com a nota: ", media)
   senao
      se media < 5 entao
         Escreval("Você reprovou com a nota: ", media)
      senao
         Escreval("Você está de recuperação com a nota: ", media)
      fimse
fimse
Fimalgoritmo