package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        
        int a,b;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = leitor.nextInt();
        
        System.out.println("Digite o valor de B: ");
        b = leitor.nextInt();
        
        if(a > b){
            System.out.println("");
            System.out.println("Os valores s�o A: " +a+ " B: " +b+ " , referente as informa��es coletadas, o valor de A:" +a+ " � maior");
        } else {
            System.out.println("");
            System.out.println("Os valores s�o A: " +a+ " B: " +b+ " , referente as informa��es coletadas, o valor de B:" +b+ " � maior");
        }
                
    }
    
}
