public class Monitor extends Aluno{

    double percentualDeBolsa;

    @Override
    public String toString() {
        return "Monitor{" +
                "percentualDeBolsa=" + percentualDeBolsa +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
