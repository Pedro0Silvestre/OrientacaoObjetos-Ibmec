import javax.swing.*;

public class Programa {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        System.out.println("Olá " + nome);

        if (idade >= 18) {
            System.out.println("você pode ser preso mané 😊");
            JOptionPane.showMessageDialog(null,"Você pode se matricular no curso");
        }
    }
}
