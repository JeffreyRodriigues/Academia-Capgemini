package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioNove {
    
    public static void main(String[] args) {
        
        float deposito, rendimento, saldo;
        
        Scanner leitor = new Scanner(System.in);
        
        rendimento = 0.07f;
        
        System.out.println("Digite o valor em reais a depositar: ");
        deposito = leitor.nextFloat();
        
        rendimento = deposito * rendimento;
        saldo = deposito + rendimento;
        
        System.out.println("O seu deposito teve um rendimento de: R$" +rendimento+ "e o saldo total após 1 mês é de: " +saldo);
    }
    
}
