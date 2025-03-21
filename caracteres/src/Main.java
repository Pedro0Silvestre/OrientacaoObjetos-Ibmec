import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int quantidadeVogais = 0;
        int quantidadeDigitos = 0;
        int quantidadeOutrosCaracteres = 0;

        while (true) {
            System.out.println("Digite um caracter: ");
            char caracteres = leitura.next().charAt(0);
            if (caracteres == '.') {
                break;
            }

            switch (caracteres) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++quantidadeVogais;
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    ++quantidadeDigitos;
                    break;
                default:
                    ++quantidadeOutrosCaracteres;
        }
        }
        System.out.printf("""
                Quantidade de vogais: %d
                Quantidade de digitos: %d
                Quantidade dos demais caracteres: %d
                """,quantidadeVogais,quantidadeDigitos,quantidadeOutrosCaracteres);
    }
}