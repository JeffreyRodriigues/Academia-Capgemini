package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        
        float celsius;
        float fahrenheit;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor em graus Celsius: ");
        celsius = leitor.nextFloat();
        
        fahrenheit = (9*celsius+160)/5;
        
        System.out.println("O valor em Cº é: " + celsius + " convertido para Fº é: " + fahrenheit);
    }
    
}
