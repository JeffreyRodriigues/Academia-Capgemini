Algoritmo "Estruturas Condicionais"
// Descri��o   : Testes
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
      
      se media < 7 entao
         Escreval("Est� de recupera��o")
      senao
         Escreval("Voc� passou!")
      fimse
Fimalgoritmo