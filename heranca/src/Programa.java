public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.telefone = "123456789";
        System.out.println("Telefone do " + pessoa1.nome + ": " + pessoa1.telefone);
        pessoa1.mudarTelefone("0987654321");
        System.out.println("Telefone do " + pessoa1.nome + ": " + pessoa1.telefone);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Maria";
        aluno1.telefone = "123456789";
        aluno1.matricula = "202309876581";
        System.out.println("Telefone do(a) " + aluno1.nome + ": " + aluno1.telefone);
        aluno1.mudarTelefone("0987654321");
        System.out.println("Telefone do " + aluno1.nome + ": " + aluno1.telefone);

        Professor professor1 = new Professor();
        professor1.nome = "Mangeli";
        professor1.telefone = "0987654321";
        professor1.titulacao = "Mestre";
        System.out.println("Telefone do(a) " + professor1.nome + ": " + professor1.telefone + " Titulacao: " + professor1.titulacao);
        professor1.mudarTelefone("0987654321");
        professor1.mudarTitulacao("Doutor");
        System.out.println("Telefone do(a) " + professor1.nome + ": " + professor1.telefone + " Titulacao: " + professor1.titulacao);

        Monitor monitor1 = new Monitor();
        monitor1.nome = "Pedro";
        monitor1.telefone = "123456789";
        monitor1.matricula = "202408756487";
        monitor1.percentualDeBolsa = 0.25;
        System.out.println("Telefone do(a) " + aluno1.nome + ": " + aluno1.telefone);

        System.out.println(pessoa1 + "\n" + aluno1 + "\n" + professor1 + "\n" + monitor1);


    }

}
