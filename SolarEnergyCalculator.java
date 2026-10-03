import java.util.Scanner;

public class SolarEnergyCalculator {

    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Morning Energy (kWh): ");
        double morning = sc.nextDouble();

        System.out.print("Enter Evening Energy (kWh): ");
        double evening = sc.nextDouble();

        double total = calculateTotalEnergy(morning, evening);

        System.out.println("Total Energy Generated: " + total + " kWh");

        sc.close();
    }
}

