import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Consumo {


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Insira a distancia em km");
        double distanciaPercorrida = leitura.nextDouble();
        System.out.println("Insira o tempo em horas");
        int tempoGasto = leitura.nextInt();
        System.out.println("Insira o combustivel gasto em Litros");
        double gasolinaConsumida = leitura.nextDouble();

        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        double consumoMedio = distanciaPercorrida/ gasolinaConsumida;

        System.out.println("Velocidade média: " + velocidadeMedia + "Km/H" +
                            "\nConsumo médio: " + consumoMedio + " Km/L");
    }


}
