package com.capgemini.academia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeiraQuestao {

	public static void main(String[] args) {
		/* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando 
		o aractere * e espa�os. A base e altura da escada devem ser iguais ao valor de n. 
		A �ltima linha n�o deve conter nenhum espa�o.
		 */

			Scanner leia = new Scanner(System.in);

			List<String> linhas = new ArrayList<>();

			//Coleta a quantidade de linhas que digitou
			System.out.println("Digite a quantidade de linhas: ");
			int qtdLinhas = leia.nextInt();

			// Faz uma contagem da linha 0, at� a quantidade digitada e vai adicionando "*"
			for (int i = 0; i < qtdLinhas; i++) {
				linhas.add(" ".repeat(qtdLinhas - i) + "*".repeat(i + 1));
			}

			for (String d : linhas) {
				System.out.println(d);
			}
	}

}
