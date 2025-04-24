package model;

public class Monitor extends Aluno {

    double percentualDeBolsa;

    public Monitor(String nome, String telefone, String matricula,double percentualDeBolsa) {
        super(nome, telefone, matricula);
        this.percentualDeBolsa = percentualDeBolsa;
    }

    public double getPercentualDeBolsa() {
        return percentualDeBolsa;
    }

    public void setPercentualDeBolsa(double percentualDeBolsa) {
        this.percentualDeBolsa = percentualDeBolsa;
    }

    @Override
    public String toString() {
        return "model.Monitor{" +
                "percentualDeBolsa=" + percentualDeBolsa +
                ", matricula='" + matricula + '\'' +
                ", nome='" + getNome() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
