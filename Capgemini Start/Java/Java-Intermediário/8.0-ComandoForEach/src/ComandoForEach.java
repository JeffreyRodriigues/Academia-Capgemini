
public class ComandoForEach {

	public static void main(String[] args) {
		// Criar um vetor, carregar, inicializar, e e, seguida ler os elementos do vetor
		
		int[] vetorNumeros = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		System.out.println("Varrendo vetor sem o ForEach");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.println("Número : " + vetorNumeros[i]);
		}
		
		System.out.println("");
		System.out.println("Varrendo vetor com ForEach");
		for (Integer listaNumeros : vetorNumeros) {
			System.out.println("Número : " + listaNumeros);
		}
	}

}
