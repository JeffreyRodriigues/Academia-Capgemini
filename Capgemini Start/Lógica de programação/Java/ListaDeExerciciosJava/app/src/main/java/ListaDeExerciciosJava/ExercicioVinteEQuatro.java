package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioVinteEQuatro {
    
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        char desejaContinuar = 'S';
        
        while(desejaContinuar == 'S' || desejaContinuar == 's'){
            
            System.out.println("DIGITE UM N�MERO: ");
          
            int numero = leitorScanner.nextInt();
            
            if(numero == 0) {
                System.out.println("O n�mero � zero");
            } else {
                if(numero > 0){
                    System.out.println("O n�mero � maior que zero");
                } else {
                    System.out.println("O n�mero � menor que zero");
                }
            }
            
            System.out.println("Deseja continuar? S - Sim / N - N�o");
            desejaContinuar = leitorScanner.next().charAt(0);
            
        }
    }
    
}
