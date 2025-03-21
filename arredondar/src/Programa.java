import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um numero");
        double x = leitura.nextDouble();
        if (x - Math.floor(x) >= 0.5) {
            System.out.printf("Numero arredondado: %f",Math.ceil(x));
        }
        else System.out.printf("Numero arredondado: %f",Math.floor(x));




    }
}