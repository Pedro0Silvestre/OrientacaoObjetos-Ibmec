package control;

import model.Aluno;
import model.Monitor;
import model.Pessoa;
import model.Professor;

public class Programa {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João","123456789");
        System.out.println("Telefone do " + pessoa1.getNome() + ": " + pessoa1.getTelefone());
        pessoa1.mudarTelefone("0987654321");
        System.out.println("Telefone do " + pessoa1.getNome() + ": " + pessoa1.getTelefone());

        Aluno aluno1 = new Aluno("Maria","123456789","202309876581");
        System.out.println("Telefone do(a) " + aluno1.getNome() + ": " + aluno1.getTelefone());
        aluno1.mudarTelefone("0987654321");
        System.out.println("Telefone do " + aluno1.getNome() + ": " + aluno1.getTelefone());

        Professor professor1 = new Professor("Mangeli","0987654321","Mestre");
        System.out.println("Telefone do(a) " + professor1.getNome() + ": " + professor1.getTelefone() + " Titulacao: " + professor1.getTitulacao());
        professor1.mudarTelefone("0987654321");
        professor1.mudarTitulacao("Doutor");
        System.out.println("Telefone do(a) " + professor1.getNome() + ": " + professor1.getTelefone() + " Titulacao: " + professor1.getTitulacao());

        Monitor monitor1 = new Monitor("Pedro","123456789", "202408756487", 0.25);
        System.out.println("Telefone do(a) " + aluno1.getNome() + ": " + aluno1.getTelefone());

        System.out.println(pessoa1 + "\n" + aluno1 + "\n" + professor1 + "\n" + monitor1);


    }

}
