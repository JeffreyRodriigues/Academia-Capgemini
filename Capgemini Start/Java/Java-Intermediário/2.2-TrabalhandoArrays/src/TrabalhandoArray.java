import javax.swing.JOptionPane;

public class TrabalhandoArray {

	public static void main(String[] args) {
		// declarando array de pa�ses
		String [] paises = new String[4];
		
		//declarando o array de n�meros
		int[] numeros = new int[10];
		
		/*//abastecendo o array de pa�ses
		for (int i = 0; i < 4; i++) {
			paises[i] = JOptionPane.showInputDialog("Informe um pa�s");
		}
		
		//listando o array de pa�ses
		for (String listaPaises : paises) {
			System.out.println(listaPaises);
		}
		*/
		//abastecendo o array de n�meros
		
		for (int i = 0; i < 10; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero"));
		}
		
		//listando o array de n�meros antes do calculo
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
		
		int novoValor = 11;
		numeros[8] = novoValor + 4;
		//listando o array de n�meros depois do calculo
		for (Integer listaNumeros : numeros) {
			System.out.println(listaNumeros);
		}
	}

}
