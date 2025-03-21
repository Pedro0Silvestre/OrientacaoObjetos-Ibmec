import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o raio do circulo");
        double raio = leitura.nextDouble();

        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio,2);

        System.out.println("Perimetro da circunferencia: " + perimetro
                           + "\nArea da circunferencia: " + area);
    }
}