
public class Aritmeticos {

	public static void main(String[] args) {
		int num1, num2, num3;
		
		//Soma
		num1 = 10;
		num2 = 20;
		num3 = num1 + num2;
		System.out.println("O resultado da soma ?: " +num3);

		//Subtra??o
		num1 = 10;
		num2 = 20;
		num3 = num1 - num2;
		System.out.println("O resultado da soma ?: " +num3);

		//Multiplica??o
		num1 = 10;
		num2 = 20;
		num3 = num1 * num2;
		System.out.println("O resultado da soma ?: " +num3);
		
		//Divis?o
		num1 = 20;
		num2 = 2;
		num3 = num1 / num2;
		System.out.println("O resultado da soma ?: " +num3);
		System.out.println("-------------------------");
		
		//Incrementando (Adicionando de 1 em 1)
		num1 = 0;
		while (num1 < 10) {
			num1++;
			System.out.println(num1);		
		}
		System.out.println("-------------------------");
		//Decrementando (Adicionando de 1 em 1)
		num1 = 11;
		while (num1 > 1) {
			num1--;
			System.out.println(num1);		
		}
				
	}

}
