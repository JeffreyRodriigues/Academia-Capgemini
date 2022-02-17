package com.capgemini.academia;

import java.util.Scanner;

public class SegundaQuestao {

	public static void main(String[] args) {
	/*
	 * D�bora se inscreveu em uma rede social para se manter em contato com seus
	 * amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e
	 * senha, por�m a senha precisa ser forte. O site considera uma senha forte
	 * quando ela satisfaz os seguintes crit�rios: Possui no m�nimo 6 caracteres.
	 * Cont�m no m�nimo 1 digito. Cont�m no m�nimo 1 letra em min�sculo. Cont�m no
	 * m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial. Os
	 * caracteres especiais s�o: !@#$%^&*()-+ D�bora digitou uma string aleat�ria no
	 * campo de senha, por�m ela n�o tem certeza se � uma senha forte. Para ajudar
	 * D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de
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

		//fazer todo o bloco enquanto verdadeiro todos os crit�rios
		do {
			//Coleta a senha
			System.out.println("\nDigite a senha");
			senha = leia.nextLine();

			//Verifica se a senha tem menos de 6 caracteres
			if (senha.length() < 6) {
				System.out.println("N�o aceitamos menos de 6 caracteres");
			} else {
				//for para confirmar que numeros, letras mai�sculas e min�sculas, e s�mbolos devem contar na senha
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
					//se n�o, inv�lido
					System.out.println("\nSenha inv�lida!\nTente novamente...");
				}
					//Os demais If's, s�o para confirmar se na senha, foi digitado todos os crit�rios para gravar a senha
				if (numero == true) {
					System.out.println("\nN�mero: V�lido");
				} else {
					System.out.println("\nN�mero: Inv�lido. \nA senha precisa ter pelo menos um n�mero");
				}
				if (maiuscula == true) {
					System.out.println("\nLetra mai�scula: V�lido");
				} else {
					System.out.println("\nN�o tem letra mai�scula. \nA senha precisa ter pelo menos uma letra mai�scula");
				}
				if (minuscula == true) {
					System.out.println("\nLetra min�scula: V�lido");
				} else {
					System.out
							.println("\nN�o tem letra min�scula. \n\nA senha precisa ter pelo menos uma letra min�scula");
				}
				if (simbolo == true) {
					System.out.println("\nS�mbolo: V�lido");
				} else {
					System.out.println("\nSem s�mbolo \nA senha precisa ter pelo menos um s�mbolo");
				}

			}
			//Enquanto falso, refazer o bloco
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false);
	}

}
