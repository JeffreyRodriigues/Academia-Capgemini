
public class ComandoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
			if (num1 < num2) {
				System.out.println("if normal - N?mero 1 ? menor que N?mero 2");
			}
			
			if (num1 > num2) {
				System.out.println("if com else - N?mero 1 ? maior");
			} else {
				System.out.println("if com else - N?mero 1 ? menor que o N?mero 2");
			}
			

			if (num1 > num2) {
				System.out.println("Condi??o composta 1 - N?mero 1 ? maior");
			} else if (num1 < num2) {
				System.out.println("Condi??o composta 1 - N?mero 1 ? menor");
			} else {
				System.out.println("Condi??o composta 1 - N?mero 1 ? igual");
			}
			
			//Condi??o composta - situa??o num1 = num2
			num1 = 10;
			num2 = 10;
			if (num1 > num2) {
				System.out.println("Condi??o composta 2 - N?mero 1 ? maior");
			} else if (num1 < num2) {
				System.out.println("Condi??o composta 2 - N?mero 1 ? menor");
			} else {
				System.out.println("Condi??o composta 2 - N?mero 1 ? igual");
			}
			
			//Comando condicional SWITCH
			char opcao = 4;
			
			switch (opcao) {
				case 1: {
					System.out.println("Chame programa de inclus?o");
					break;
					}
				case 2: {
					System.out.println("Chame programa de altera??o");
					break;
					}
				case 3: {
					System.out.println("Chame programa de exclus?o");
					break;
					}
				case 4: {
					System.out.println("Chame programa de consulta");
					break;
					}
				default:
					System.out.println("Op??o inv?lida");
			}
	}

}
