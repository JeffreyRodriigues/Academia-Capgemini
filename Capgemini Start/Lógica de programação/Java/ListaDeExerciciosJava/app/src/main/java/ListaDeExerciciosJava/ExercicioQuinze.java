package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioQuinze {
    
    public static void main(String [] args){
        
        int numero;
        
        Scanner leitorScanner = new Scanner(System.in);
        System.out.println("DIGITE UM VALOR: ");
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <=200){
            System.out.println("O n�mero est� no intervalo");
        }else {
            System.out.println("O n�mero N�O est� no intervalo");
        }
    }
    
}
