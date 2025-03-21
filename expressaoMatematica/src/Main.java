import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a operação (+,-,*,/)");
        String operacao = leitura.nextLine();

        System.out.println("Insira o primeio numero");
        double a = leitura.nextDouble();
        System.out.println("Insira o segundo numero");
        double b = leitura.nextDouble();

        switch (operacao) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;

            case "-":
                System.out.println("a - b = " + (a - b));
                break;

            case "*":
                System.out.println("a * c = " + (a * b));
                break;

            case "/":
                System.out.println("a / b = " + (a / b));
                break;
        }
    }
}