package ImprimindoArrays;

public class ImprimeArray {

	public static void main(String[] args) {
		// declarando o array
		String [] paises = new String[5];
		
		//Inicializando o array
		paises[0] = "Brasil";
		paises[1] =	"Alemanha";
		paises[2] = "It�lia";
		paises[3] = "�ustria";
		paises[4] =	"Pol�nia";
		
		for (String lista: paises) {
			System.out.println(lista);
		}

	}

}
