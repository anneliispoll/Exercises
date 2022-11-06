package vehicle;


import java.util.Scanner;

public class VehicleCalling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your fuel amount");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in vehicle");
        int passenger = scanner.nextInt();

        Vehicle2 vehicle2 = new Vehicle2(fuel, fuelUsage, passenger);
        System.out.printf("Your vehicle can drive maximum of %.2f kilometers", vehicle2.maxDistance2());

        System.out.println();
        System.out.println(vehicle2.maxDistance2(100,10,4));

    }
}
