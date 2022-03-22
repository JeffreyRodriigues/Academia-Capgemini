package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExerciciosSeis {
    
    public static void main(String[] args) {
        
        int a, b, h;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor A: ");
        a = leitor.nextInt();
        
        System.out.println("Digite o valor B: ");
        b = leitor.nextInt();
        
        h = a;
        a = b;
        b = h;
        
        System.out.println("");
        System.out.println("Os valores invertidos são: A = " + a + " B = " +b);
   }
    
}
