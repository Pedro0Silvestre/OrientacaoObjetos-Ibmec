import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro valor");
        int num1 = leitura.nextInt();
        System.out.println("Insira o segundo valor");
        int num2 = leitura.nextInt();

        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int produto = num1 * num2;
        int divisao = num1 / num2;

        System.out.println("Soma: " + soma
                        + "\nSubtracao: " + subtracao
                        + "\nMultiplicacao: " + produto
                        + "\nDivisao: " + divisao);

    }
}