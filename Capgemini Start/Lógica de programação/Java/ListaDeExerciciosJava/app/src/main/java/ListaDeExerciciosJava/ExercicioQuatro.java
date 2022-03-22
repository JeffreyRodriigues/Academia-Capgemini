package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main(String[] args) {
        
        String nome;
        float salarioFixo;
        float salarioTotal;
        float totalVendas;
        float comissao;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite o salário fixo do funcionário: ");
        salarioFixo = leitor.nextFloat();
        
        System.out.println("Digite o total de vendas realizado pelo funcionário este mês: ");
        totalVendas = leitor.nextFloat();
        
        salarioTotal = salarioFixo + (totalVendas * 15/100);
        comissao = (totalVendas * 15/100);
        
        System.out.println("");
        System.out.println("O funcionário " + nome + " recebeu o valor de: " + salarioFixo + " + comissão de: " + comissao +  " totalizando um salário de: " + salarioTotal );
    }
}
