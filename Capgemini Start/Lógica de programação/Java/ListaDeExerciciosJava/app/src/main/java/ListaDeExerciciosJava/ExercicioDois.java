package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioDois {
    
    public static void main(String[] args) {
        int a, b;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        a = leitor.nextInt();
        
        System.out.println("Digite o segundo número: ");
        b = leitor.nextInt();
        
        System.out.println("");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " x " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        
    }
    
}
