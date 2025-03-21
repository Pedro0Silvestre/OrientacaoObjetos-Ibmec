import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double media = 0;
        double nota = 0;
        double maiorNota = 0;
        double menorNota = 20;
        int quantidadeAlunos = 0;

        while (true) {
            System.out.println("Insira a nota do aluno");
            nota = leitura.nextDouble();
            if (nota == -1) break;

            ++quantidadeAlunos;
            media += nota;
            if (nota > maiorNota) maiorNota = nota;
            if (nota < menorNota) menorNota = nota;
        }
        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
        System.out.println("Média dos alunos: " + media/quantidadeAlunos);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Maior nota: " + maiorNota);
    }
}