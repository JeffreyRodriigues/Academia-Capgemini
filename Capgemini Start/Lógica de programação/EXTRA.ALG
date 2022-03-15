Algoritmo "Extra"
// Descrição   : Testes
// Autor(a)    : Jeffrey
// Data atual  : 15/03/2022
Var
   altura, peso, imc: real
   
Inicio
      Escreval("Informe sua altura, por favor")
      leia(altura)
      Escreval("Informe seu peso, por gentileza")
      leia(peso)
      imc <- peso / altura^2
      
      se imc < 19 entao
         escreval("Abaixo do peso")
      senao
      se imc < 24 entao
         escreval("Peso ideal")
      senao
         escreval("Está acima do peso")
      fimse
      fimse
         

Fimalgoritmo