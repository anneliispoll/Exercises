package Advanced;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //set height
        System.out.println("Enter tree height: ");
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {

            //print indentation
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }
            //print out stars
            for (int star = 1; star <= i * 2 - 1; star++) {
                System.out.print("*");
            }
            //print new line
            System.out.println();
        }
        //tree rack
        for (int rack = 1; rack <= height - 1; rack++) {
            System.out.print(" ");
        }
        System.out.print("#");

    }
}
