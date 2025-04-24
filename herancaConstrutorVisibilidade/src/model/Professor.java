package model;

public class Professor extends Pessoa{

    String titulacao;

    public Professor(String nome, String telefone, String titulacao) {
        super(nome, telefone);
        this.titulacao = titulacao;
    }

    public void mudarTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "model.Professor{" +
                "telefone='" + getTelefone() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
}
