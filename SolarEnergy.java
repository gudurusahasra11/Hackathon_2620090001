import java.util.Scanner;

public class SolarEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Panel ID: ");
        int panelId = sc.nextInt();

        System.out.print("Enter Energy generated (kWh): ");
        double energyGenerated = sc.nextDouble();

        System.out.print("Enter Number of solar panels ");
        int numPanels = sc.nextInt();

        System.out.print("Enter System status (Y/N): ");
        char status = sc.next().charAt(0);

        
        System.out.println("\n--- Rooftop Solar System Details ---");
        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated (kWh): " + energyGenerated);
        System.out.println("Number of Panels: " + numPanels);
        System.out.println("System Status: " + status);

        sc.close();

    }
}
