public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Pedro","2398765490","Engenharia de software");
        Aluno aluno2 = new Aluno("Joao","9278756790","ADS");

        System.out.print(aluno1);
        aluno1.trocarDeCurso("CDIA");
        aluno1.mudarNome("Jéssica");
        System.out.println(aluno1);
    }
}