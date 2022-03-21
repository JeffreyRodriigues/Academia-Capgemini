package EstruturaCondicionalSe;

public class App {

    public static void main(String[] args) {

        int media = 10;

        if (media >= 7) {
            if (media == 10) {
                System.out.println("APROVADO COM NOTA MÁXIMA");
            } else {
                System.out.println("APROVADO");
            }
        } else {
            System.out.println("REPROVADO");
        }

    }
}
