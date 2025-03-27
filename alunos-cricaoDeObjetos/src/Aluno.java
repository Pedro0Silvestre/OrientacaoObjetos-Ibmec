import java.awt.*;

public class Aluno {

    String nome, matricula, curso;

    public Aluno(String nome,String matricula, String curso) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    void trocarDeCurso(String curso) {
        this.curso = curso;
    }

    void mudarNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", curso='" + curso + '\'' +
                "}\n";
    }

    public static void main(String[] args) {
        System.out.println("ola");
    }


}


