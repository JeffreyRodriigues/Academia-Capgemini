package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExercicioTreze {

    public static void main(String[] args) {

        int a;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um n�mero: ");
        a = leitor.nextInt();

        if (a > 10) {
            System.out.println("O n�mero: " + a + " � maior que 10");
        } else {
            System.out.println("--");
        }

    }
}
