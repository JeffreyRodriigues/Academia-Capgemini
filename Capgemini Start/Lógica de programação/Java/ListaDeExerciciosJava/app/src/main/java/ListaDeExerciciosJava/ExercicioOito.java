package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioOito {
    
    public static void main(String[] args) {
        
        float real, dolar, cotacao;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor em Dolar: $ ");
        dolar = leitor.nextFloat();
        System.out.println("Digite o valor da cota��o do Dolar: $ ");
        cotacao = leitor.nextFloat();
        
        real = dolar * cotacao;
        
        System.out.println("");
        System.out.println("A cota��o do d�lar � de: R$ " +cotacao);
        System.out.println("");
        System.out.println("O  cliente tem $ " + dolar + " d�lares");
        System.out.println("");
        System.out.println("O cliente tem R$" + real + " reais");
    }
    
}
