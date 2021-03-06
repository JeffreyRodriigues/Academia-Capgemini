package Construtores;

import Construtores.Aluno.MATRICULA;
import Construtores.Aluno.STATUS;

public class Construtor {

	public static void main(String[] args) {
		// Passando os dados atrav?s do contrutor com sobrecarga
		Aluno alu = new Aluno(6, 5, 6);
		double mediaAlunoFinal = alu.calcularMediaAluno();
		
		//Definindo situa??o do aluno
		if (mediaAlunoFinal < 6) {
			alu.situacaoAluno = STATUS.REPROVADO;
		} else {
			alu.situacaoAluno = STATUS.APROVADO;
		}
		
		//Imprimindo situa??o do aluno
		System.out.println("A m?dia do aluno ?: " +alu.calcularMediaAluno() + " e o aluno est? " + alu.situacaoAluno);
		
		
		//usa enum MATRICULA
		alu.situacaoMatricula = MATRICULA.PENDENTE;
		System.out.println("O status da matricula do aluno est?: " +alu.situacaoMatricula);
	}

}
