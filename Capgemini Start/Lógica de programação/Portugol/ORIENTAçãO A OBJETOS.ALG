Algoritmo "Orientação a Objetos"
// Autor(a)    : Jeffrey Rodrigues
// Data atual  : 17/03/2022

tipo
cadastroCliente = registro
  nome: caractere
  rg: caractere
  idade: inteiro
fimregistro

Var

cliente1 : cadastroCliente

Inicio

escreval("Digite seu nome: ")
leia(cliente1.nome)
escreval("Digite seu RG: ")
leia(cliente1.rg)
escreval("Digite sua idade: ")
leia(cliente1.idade)

escreval("Nome: ", cliente1.nome," - RG: ", cliente1.rg, " - Idade: ", cliente1.idade)

Fimalgoritmo