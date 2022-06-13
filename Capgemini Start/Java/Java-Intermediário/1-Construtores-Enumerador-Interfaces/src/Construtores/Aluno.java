package Construtores;

public class Aluno {
	private double nota1;
	private double nota2;
	private double nota3;
	STATUS situacaoAluno;
	
	public Aluno(double nota1, double nota2, double nota3) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	//Definindo o Enumerador
	public enum STATUS {
		APROVADO,
		REPROVADO
	}
	
	//Método para calcular a média do aluno
	public double calcularMediaAluno() {
		double mediaAluno = 0;
		//calculo
		mediaAluno = (this.nota1 + this.nota2 + this.nota3) / 3;
		return mediaAluno;
	}
	

}
