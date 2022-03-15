Algoritmo "Menu"
// Descrição   : Testes
// Autor(a)    : Jeffrey
// Data atual  : 15/03/2022
Var
    opcaoMenu: caractere
    totalConta: inteiro
Inicio
totalConta <- 0

repita
   Escreval("1 - Troca de óleo")
   Escreval("2 - Balanceamento")
   Escreval("3 - Sair")
   leia(opcaoMenu)
   se opcaoMenu = "1" entao
      totalConta <- totalConta + 100
   senao
   se opcaoMenu = "2" entao
   totalConta <- totalConta + 70
   fimse
   fimse
limpatela
ate opcaoMenu = "3"
escreval("Total da conta: R$ ", totalConta)

Fimalgoritmo