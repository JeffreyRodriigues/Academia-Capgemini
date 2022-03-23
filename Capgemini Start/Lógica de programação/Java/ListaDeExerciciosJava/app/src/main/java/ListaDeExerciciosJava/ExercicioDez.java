package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {
        
        float valorCompra, valorPrestacao;
        int qtdPrestacao = 5;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor total da compra: ");
        valorCompra = leitor.nextFloat();
        
        valorPrestacao = valorCompra / qtdPrestacao;
        
        System.out.println("");
        System.out.println("O Valor total do produto é de: " +valorCompra);
        System.out.println("");
        System.out.println("O Valor de cada prestação é de: " +valorPrestacao);
        
        
    }
    
}
