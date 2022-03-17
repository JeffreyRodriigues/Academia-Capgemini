Algoritmo "Exercicio Função & Procedimento III"
// Autor(a)    : Jeffrey Rodrigues
// Data atual  : 16/03/2022
Var
gabarito: vetor[1..10] de caractere
opcaoMenu: caractere
notaFinal: inteiro

procedimento mostrarMenu()
inicio
escreval("1 - Cadastrar Gabarito")
escreval("2 - Cadastrar Prova")
escreval("3 - Sair")
leia(opcaoMenu)

fimprocedimento


procedimento cadastrarGabarito()
var
i: inteiro

inicio
para i de 1 ate 10 faca
     escreval("Informe a resposta da questão", i)
     leia(gabarito[i])
fimpara
fimprocedimento



funcao cadastrarProva(): inteiro
var
i,nota: inteiro
resposta: caractere

inicio
nota <-0
para i de 1 ate 10 faca
     escreval("Informe a resposta da questão", i)
     leia(resposta)
     se resposta = gabarito[i] entao
        nota <- nota + 1
     fimse
     retorne nota
fimpara
fimfuncao


funcao verificarSituacao(nota: inteiro): caractere
inicio
      se nota >= 7 entao
         retorne "Aprovado"
      senao
         retorne "Reprovado"
      fimse

fimfuncao

inicio

repita
      mostrarMenu()
      escolha opcaoMenu
              caso "1"
                   cadastrarGabarito()
              caso "2"
                   notaFinal <- cadastrarProva()
                   escreval verificarSituacao(notaFinal)
              outrocaso
                   escreval("Opção Inválida")
ate opcaoMenu = "3"

Fimalgoritmo
