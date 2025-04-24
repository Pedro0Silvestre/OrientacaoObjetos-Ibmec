package model;

public class Aluno extends Pessoa {

    String matricula;

    public Aluno(String nome, String telefone, String matricula) {
        super(nome,telefone);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "model.Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
