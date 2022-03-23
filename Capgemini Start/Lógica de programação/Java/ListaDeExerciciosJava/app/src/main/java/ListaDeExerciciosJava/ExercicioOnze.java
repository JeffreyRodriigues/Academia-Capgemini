package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioOnze {

    public static void main(String[] args) {

        float valorProduto, valorVenda;
        float acrescimo;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        valorProduto = leitor.nextFloat();

        System.out.println("Digite o percentual do acréscimo: ");
        acrescimo = leitor.nextFloat();

        if (acrescimo < 0 || acrescimo > 100) {
            System.out.println("O percentual a ser acrescentada só pode ser colocado de 0 a 100");
        } else {

            valorVenda = valorProduto + (valorProduto * acrescimo / 100);

            System.out.println("O Real valor de vendo do produto é de: " + valorVenda);
        }

    }
}
