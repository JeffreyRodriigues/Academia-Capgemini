package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        
        String nome;
        float a,b,c,d;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite o valor da primeira nota do aluno: ");
        a = leitor.nextFloat();
        
        System.out.println("Digite o valor da segunda nota do aluno: ");
        b = leitor.nextFloat();
        
        System.out.println("Digite o valor da terceira nota do aluno: ");
        c = leitor.nextFloat();
        
        d = (a + b + c)/3;
        
        System.out.println("A média do aluno " +nome + " foi de: " + d);
        
    }
}
