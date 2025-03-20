import javax.swing.*;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário atual"));

        double percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de aumento (%)"));

        double salarioReajustado = salario * (1 + percentual/100);

        JOptionPane.showMessageDialog(null,"Seu novo salário é R$" + salarioReajustado);

    }
}
