import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCarros {

	public static void main(String[] args) {
		// Construindo um arraylist para os carros
	ArrayList<String> carros = new ArrayList<>();
	
	//adicionando Carros ao arrayList
	carros.add("FLUENCE");
	carros.add("KOMBI");
	carros.add("JAGUAR");
	carros.add("BMW");
	carros.add("MERCEDES");
	carros.add("FUSCA");
	carros.add("VECTRA");
	carros.add("SANDERO");
	
	//mostra array
	System.out.println(carros);
	
	//substituir FUSCA por MITSUBISHI
	carros.set(4, "MITSUBISHI");
	
	//mostra array
	System.out.println(carros);
	
	//remover VECTRA
	carros.remove("VECTRA");
	
	//mostra array
	System.out.println(carros);
	
	// adicionando Carros ao arrayList com JOptionPane
	carros.add(JOptionPane.showInputDialog("Informe a marca do carro"));
	
	//mostra array
	System.out.println(carros);
	
	//esvaziando o array
	/*carros.clear();
	//mostra array
	System.out.println(carros);
	
	//verificar se o array est? vazio
	if (carros.isEmpty()) {
		System.out.println("O vetor est? vazio");
	}*/
	System.out.println(carros.size());
	if (carros.contains("BMW")) {
		//substituindo quando n?o se sabe a posi??o
		for (int i = 0; i < carros.size(); i++) {
			if("BMW".equals(carros.get(i))) {
				carros.set(i, "BUGATTI");
				break;
			} 
		}
	} else {
		System.out.println("N?o achei o argumento pesquisado");
	}

	//mostrar array
	System.out.println(carros);
	}

}
