package ListaDeExerciciosJava;

import java.util.Scanner;


public class ExercicioVinte {
    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        char desejaRepetir = 's';
        
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            
            //Entrada
            System.out.println("Digite o ano de fabiração do veículo: ");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veículo: ");
            valorCarro = leitor.nextFloat();
            
            if(anoFabricacao <= 2000){
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.07f;
                totalCarrosSemiNovos++;
            }
            totalCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("O valor de desconto foi de: " +valorDesconto);
            System.out.println("O valor a pagar é de: " +valorPagar);
            
            System.out.println("Deseja fazer outro cadastro? S - SIM / N - NÃO");
            desejaRepetir = leitor.next().charAt(0);
        }
        
        System.out.println("Total de carros seminovos: " +totalCarrosSemiNovos);
        System.out.println("Total de carros: " +totalCarros);
    }
    
}
