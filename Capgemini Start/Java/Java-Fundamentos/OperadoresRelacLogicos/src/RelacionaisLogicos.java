
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < >= <= != =
		
		int num1, num2;
		
		//Testando igualdade
		num1 = 10;
		num2 = 10;
		if (num1 == num2) {
			System.out.println("N?mero 1 e N?mero 2 s?o iguais");
		}
		
		//Testando desigualdade
		num1 = 10;
		num2 = 30;
		if (num1 != num2) {
			System.out.println("N?mero 1 e N?mero 2 s?o diferentes");
		}
		
		//Testando maior
		num1 = 30;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("N?mero 1 ? maior que N?mero 2");
		} else {
			System.out.println("N?mero 2 ? maior que N?mero 1");
		}
		
		//Operadores l?gicos
		// && = AND ou "e"	|| = OR ou "ou"
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira op??o satisfeita");
		} else {
			System.out.println("Segunda op??o satisfeita");

		}
		
		num2 = 10;
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira op??o satisfeita");
		} else {
			System.out.println("Segunda op??o satisfeita");

		}

	}

}
