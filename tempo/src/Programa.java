import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira um valor de tempo em segundos");
        int t = leitura.nextInt();
        int tempoEmHoras = t/3600;
        int tempoEmMinuto = (t%3600)/60;
        int tempoEmSegundo = (t%3600)%60;
        System.out.println("Tempo em horas: " + tempoEmHoras
        + "\nTempo em minutos: " + tempoEmMinuto
        + "\nTempo em segundos: " + tempoEmSegundo);
    }
}
