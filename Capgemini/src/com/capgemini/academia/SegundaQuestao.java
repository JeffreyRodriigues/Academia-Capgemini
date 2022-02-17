package com.capgemini.academia;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
	/*
	 * Débora se inscreveu em uma rede social para se manter em contato com seus
	 * amigos. A página de cadastro exigia o preenchimento dos campos de nome e
	 * senha, porém a senha precisa ser forte. O site considera uma senha forte
	 * quando ela satisfaz os seguintes critérios: Possui no mínimo 6 caracteres.
	 * Contém no mínimo 1 digito. Contém no mínimo 1 letra em minúsculo. Contém no
	 * mínimo 1 letra em maiúsculo. Contém no mínimo 1 caractere especial. Os
	 * caracteres especiais são: !@#$%^&*()-+ Débora digitou uma string aleatória no
	 * campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar
	 * Débora, construa um algoritmo que informe qual é o número mínimo de
	 * caracteres que devem ser adicionados para uma string qualquer ser considerada
	 * segura.
	 * 
	 */
		boolean numero = false;
		boolean maiuscula = false;
		boolean minuscula = false;
		boolean simbolo = false;
		String senha;
		Scanner leia = new Scanner(System.in);

		//fazer todo o bloco enquanto verdadeiro todos os critérios
		do {
			//Coleta a senha
			System.out.println("\nDigite a senha");
			senha = leia.nextLine();

			//Verifica se a senha tem menos de 6 caracteres
			if (senha.length() < 6) {
				System.out.println("Não aceitamos menos de 6 caracteres");
			} else {
				//for para confirmar que numeros, letras maiúsculas e minúsculas, e símbolos devem contar na senha
				for (char c : senha.toCharArray()) {
					if (c >= '0' && c <= '9') {
						numero = true;
					} else if (c >= 'A' && c <= 'Z') {
						maiuscula = true;
					} else if (c >= 'a' && c <= 'z') {
						minuscula = true;
					} else {
						simbolo = true;
					}
				}
				//se todos os atribudos forem preenchidos, mostrar na tela a senha cadastrada
				if (numero == true && maiuscula == true && minuscula == true && simbolo == true) {
					System.out.println("\n**Senha cadastrada com sucesso**\n");
				} else {
					//se não, inválido
					System.out.println("\nSenha inválida!\nTente novamente...");
				}
					//Os demais If's, são para confirmar se na senha, foi digitado todos os critérios para gravar a senha
				if (numero == true) {
					System.out.println("\nNúmero: Válido");
				} else {
					System.out.println("\nNúmero: Inválido. \nA senha precisa ter pelo menos um número");
				}
				if (maiuscula == true) {
					System.out.println("\nLetra maiúscula: Válido");
				} else {
					System.out.println("\nNão tem letra maiúscula. \nA senha precisa ter pelo menos uma letra maiúscula");
				}
				if (minuscula == true) {
					System.out.println("\nLetra minúscula: Válido");
				} else {
					System.out
							.println("\nNão tem letra minúscula. \n\nA senha precisa ter pelo menos uma letra minúscula");
				}
				if (simbolo == true) {
					System.out.println("\nSímbolo: Válido");
				} else {
					System.out.println("\nSem símbolo \nA senha precisa ter pelo menos um símbolo");
				}

			}
			//Enquanto falso, refazer o bloco
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false);
	}

}
