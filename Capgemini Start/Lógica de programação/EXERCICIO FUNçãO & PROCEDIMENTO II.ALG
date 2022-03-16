Algoritmo "Exercicio Função & Procedimento II"
// Autor(a)    : Jeffrey Rodrigues
// Data atual  : 16/03/2022
Var
opcaoMenu: caractere
clientes: vetor[1..5] de caractere

procedimento mostrarMenu()
inicio
  escreval("1 - Cadastrar")
  escreval("2 - Pesquisar")
  escreval("3 - Excluir")
  leia(opcaoMenu)
fimprocedimento

procedimento cadastrar()
var
   i: inteiro

inicio
  para i de 1 ate 5 faca
      se clientes[i] = "" entao
       escreval("Informe o nome do cliente")
       leia(clientes[i])
      fimse
  fimpara
fimprocedimento


procedimento pesquisar()
var
   i: inteiro
   nomePesquisado : caractere
   indiceSucesso: inteiro
inicio

  escreval("Informe o nome do cliente que deseja pesquisar")
  leia(nomePesquisado)
  indiceSucesso <- -1
  para i de 1 ate 5 faca
      se clientes[i] = nomePesquisado entao
      indiceSucesso <- i
       interrompa
      fimse
  fimpara
  se indiceSucesso = -1 entao
     escreval("Cliente não encontrado")
  senao
     escreval("Cliente encontrado na posição" , indiceSucesso)
  fimse
fimprocedimento


procedimento excluir()
var
   indiceExclusao: inteiro

inicio

  escreval("Informe o indice a excluir")
  leia(indiceExclusao)
  se (indiceExclusao > 5) OU (indiceExclusao < 1) entao
     escreval("Indice inválido")
  senao
     clientes[indiceExclusao] <- ""
  fimse
fimprocedimento


inicio
  repita
        mostrarMenu()
        escolha opcaoMenu
                caso "1"
                     cadastrar()
                caso "2"
                     pesquisar()
                caso "3"
                     excluir()
                outrocaso
                   escreval("opção inválida")
        fimescolha
  ate opcaoMenu = "4"


Fimalgoritmo
