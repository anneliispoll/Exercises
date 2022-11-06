package Advanced;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //take user input type int
        System.out.println("Enter a year: ");

        int year = scanner.nextInt();

        //check if the number entered is divisible by 400 || divisible 4 && not divisble 100.

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
