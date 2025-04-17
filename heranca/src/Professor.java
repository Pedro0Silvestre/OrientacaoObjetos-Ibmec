public class Professor extends Pessoa{

    String titulacao;

    public void mudarTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "telefone='" + telefone + '\'' +
                ", nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                '}';
    }
}
