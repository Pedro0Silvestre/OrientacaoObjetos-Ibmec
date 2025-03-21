import java.util.Scanner;

public class Main {

    static void paresNoIntervalo(int a, int b) {
        while (a != b + 1) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
            ++a;
        }
    }

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int a = leitura.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = leitura.nextInt();



        if (a < b) paresNoIntervalo(a,b);
        else paresNoIntervalo(b,a);

    }
}