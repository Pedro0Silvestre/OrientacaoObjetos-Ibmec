import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;

        System.out.println("Insira o numero de alunos: ");
        int alunos = leitura.nextInt();

        for (int i = 1; i <= alunos ; i++) {
            System.out.printf("Insira a nota do aluno %d: ",i);
            media += leitura.nextDouble();
        }
        System.out.println("Média da turma: "+ media/alunos);

    }
}