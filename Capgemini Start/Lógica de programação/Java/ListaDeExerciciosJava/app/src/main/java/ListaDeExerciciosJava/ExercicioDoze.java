package ListaDeExerciciosJava;

import java.util.Scanner;

//carroNovo = custoFabrica + pDistribuidor + impostos
//imposto > custoFabrica
//pDistribuidor > total

public class ExercicioDoze {
    public static void main(String[] args) {
        
        float carroNovo, custoF, imposto, impostoF,pDistribuidor;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor do custo de fábrica: ");
        custoF = leitor.nextFloat();
        
        System.out.println("Insira a porcentagem do imposto aplicado ao custo de fábrica: ");
        impostoF = leitor.nextFloat();
        
        System.out.println("Insira o percentual do distribuidor: ");
        pDistribuidor = leitor.nextFloat();
        
        imposto = custoF + (custoF * impostoF/100);
        carroNovo = imposto + (imposto * pDistribuidor/100);
        
        System.out.println("");
        System.out.println("A porcentagem do imposto de fábrica é de: " +impostoF+ "% , sendo assim, o valor de fábrica do carro é de: R$ " +imposto);
        System.out.println("");
        System.out.println("A porcentagem do distribuidor é de: " +pDistribuidor+ "% , portanto, o valor do carro para o consumidor é de: R$ " +carroNovo);
        
        
        
        
    }
    
}
