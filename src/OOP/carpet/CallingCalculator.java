package OOP.carpet;

import java.util.Scanner;

public class CallingCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor size");
        System.out.println("Enter floor length");
        double length = scanner.nextDouble();

        System.out.println("Enter floor width");
        double width = scanner.nextDouble();

        //create floor class object
        Floor floor = new Floor(width, length);

        System.out.println("Enter carpet price per m2");
        double cost = scanner.nextDouble();

        //Create carpet class object
        Carpet carpet = new Carpet(cost);

        //create calculator object and pass floor and carpet object as input parameters

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Carpet will cost: " + calculator.getTotalCost() + "Eur");
    }
}
