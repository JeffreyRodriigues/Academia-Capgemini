package ListaDeExerciciosJava;

import java.util.Scanner;

public class ExerciciosTres {
    
    public static void main(String[] args) {
        
        float consumoMedio;
        float distanciaPercorrida;
        float totalCombustivelGasto;
        
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual a distancia percorrida? ");
        distanciaPercorrida = leitor.nextFloat();
        
        System.out.println("Qual a quantidade de combustível gasto? ");
        totalCombustivelGasto = leitor.nextFloat();
        
        consumoMedio = distanciaPercorrida / totalCombustivelGasto;
        
        System.out.println("A média de kilometros por litro é: " + consumoMedio);
        
    }
    
}
