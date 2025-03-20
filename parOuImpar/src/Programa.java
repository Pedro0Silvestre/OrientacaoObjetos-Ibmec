import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um valor inteiro");
        int n = leitura.nextInt();

        if (n%2 == 0) {
            System.out.printf("o numero %d é par",n);
        }
        else {
            System.out.printf("o numero %d é ímpar",n);
        }
    }
}
