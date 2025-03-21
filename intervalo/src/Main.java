import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um numero N");
        int n = leitura.nextInt();

        System.out.println("Insira um numero inferior");
        int inferior = leitura.nextInt();

        System.out.println("Insira um numero superior");
        int superior = leitura.nextInt();

        if (n < inferior) System.out.println("Numero antes do intervalo");
        else if (n > superior) System.out.println("Numero depois do intervalo");
        else System.out.println("Numero dentro do intervalo");


    }
}