import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira o primeiro valor");
        float num1 = leitura.nextFloat();
        System.out.println("Insira o segundo valor");
        float num2 = leitura.nextFloat();

        float soma = num1 + num2;
        float subtracao = num1 - num2;
        float produto = num1 * num2;
        float divisao = num1 / num2;

        System.out.println("Soma: " + soma
                + "\nSubtracao: " + subtracao
                + "\nMultiplicacao: " + produto
                + "\nDivisao: " + divisao);

    }
}