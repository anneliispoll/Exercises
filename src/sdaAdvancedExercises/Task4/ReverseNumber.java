package sdaAdvancedExercises.Task4;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        int userInput;
        int lastDigit;
        int reverseFormula = 0;

        Scanner scanner = new Scanner(System.in);

         userInput = scanner.nextInt();

        while (userInput > 0) {
            //getting the last digit
            lastDigit = userInput % 10;
            //storing last digit in a variable reverseFormula
            reverseFormula = reverseFormula * 10 + lastDigit;
            //eliminating last digit
            userInput = userInput / 10;
        }

        System.out.println(reverseFormula);





    }
}
