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
        
        System.out.println("Digite o nome do funcion�rio: ");
        nome = leitor.nextLine();
        
        System.out.println("Digite o sal�rio fixo do funcion�rio: ");
        salarioFixo = leitor.nextFloat();
        
        System.out.println("Digite o total de vendas realizado pelo funcion�rio este m�s: ");
        totalVendas = leitor.nextFloat();
        
        salarioTotal = salarioFixo + (totalVendas * 15/100);
        comissao = (totalVendas * 15/100);
        
        System.out.println("");
        System.out.println("O funcion�rio " + nome + " recebeu o valor de: " + salarioFixo + " + comiss�o de: " + comissao +  " totalizando um sal�rio de: " + salarioTotal );
    }
}
