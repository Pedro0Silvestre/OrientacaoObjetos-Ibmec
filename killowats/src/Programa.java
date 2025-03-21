import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double gastoTotal;

        System.out.println("Insira o total de energia consumida em kilowatts");
        double kilowatts = leitura.nextDouble();
        System.out.println("Insira o valor do kilowatts");
        double valorKiloWatts = leitura.nextDouble();

        if (kilowatts < 150) gastoTotal = kilowatts * valorKiloWatts * 0.9;

        else gastoTotal = kilowatts * valorKiloWatts;

        System.out.println("Gasto total: "+ gastoTotal);
    }
}