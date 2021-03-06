import java.util.LinkedList;

public class LinkedListCarros {

	public static void main(String[] args) {
		/*
		 addFirst()
		 addLast()
		 removeFirst()
		 removeLast()
		 getFirst()
		 getLast()
		 */
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("VOLVO");
		cars.add("BMW");
		cars.add("FORD");
		System.out.println(cars);
		System.out.println("Mostrando toda lista inicial");
		System.out.println("");
		
		cars.addFirst("MAZDA");
		System.out.println(cars);
		System.out.println("(addFirst) - Incluindo Mazda no in?cio");
		System.out.println("");
		
		cars.addLast("BUGATTI");
		System.out.println(cars);
		System.out.println("(addLast) - Incluindo Bugatti no fim");
		System.out.println("");
		
		String carro;
		carro = cars.get(3);
		System.out.println(carro);
		System.out.println("(get(position)) - Mostrando carro da terceira posi??o");
		System.out.println("");
		
		cars.removeFirst();
		System.out.println(cars);
		System.out.println("(removeFirst) - Removendo primeiro carro da lista 'MAZDA'");
		System.out.println("");
		

		System.out.println(cars.getFirst());
		System.out.println("(getFirst) - Mostrando primeiro carro da lista");
		System.out.println("");
		
		System.out.println(cars.getLast());
		System.out.println("(getLast) - Mostrando ?ltimo carro da lista");
		System.out.println("");
		
		cars.removeLast();
		System.out.println(cars);
		System.out.println("(removeLast) - Removendo ?ltimo carro da lista 'BUGATTI'");
		System.out.println("");
		
		cars.clear();
		if (cars.isEmpty()) {
			System.out.println("(clear) - LinkedList Vazio");
		}
	}

}
