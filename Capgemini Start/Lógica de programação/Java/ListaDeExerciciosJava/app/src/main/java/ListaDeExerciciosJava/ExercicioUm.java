package ListaDeExerciciosJava;

import java.util.Scanner;

class ExercicioUm {
    
    public static void main(String[] args){
        
        int a;
        int b;
        int c;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        a = leitor.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        b = leitor.nextInt();
        
                c = a + b;
        
        System.out.println("O Valor de " + a + " + " + b + " = " + c);
                
    }
    
}
