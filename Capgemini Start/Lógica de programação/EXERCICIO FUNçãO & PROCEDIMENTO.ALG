Algoritmo "Exercicio Função & Procedimento"
// Autor(a)    : Jeffrey Rodrigues
// Data atual  : 16/03/2022
Var

lado1, lado2, lado3 : inteiro

procedimento lerDados()
inicio
  escreval("Lado 1: ")
  leia(lado1)
  escreval("Lado 2: ")
  leia(lado2)
  escreval("Lado 3: ")
  leia(lado3)
fimprocedimento

funcao verificarIntegridadeTriangulo(): logico
inicio
      se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) OU (lado3 > lado1 + lado2) entao
         retorne falso
      senao
         retorne verdadeiro
      fimse
fimfuncao

funcao verificarTipoTriangulo(): caractere
inicio
      se (lado1 = lado2) E (lado2 = lado3) entao
         retorne "Equilátero"
      senao
      se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
         retorne "Isósceles"
      senao
         retorne "Escaleno"
      fimse
      fimse
fimfuncao

Inicio
  lerDados()
  se verificarIntegridadeTriangulo() entao
     escreval(verificarTipoTriangulo())
  senao
     escreval("Não é triangulo")
  fimse
Fimalgoritmo
