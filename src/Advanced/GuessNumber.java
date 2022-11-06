package Advanced;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        //ask user to enter number
        //generate random number between 0 to entered number
        //ask user to guess the number until they have entered the generated number
        //congratulate user for guessing the number

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //ask user to enter number
        System.out.println("Enter a number: ");
        int userInput = scanner.nextInt();

        //generate random number between 0 to entered number
        int generatedRandomNumber = random.nextInt(userInput); // int generatedRandomNumber = (int) (Math.random() * (max + 1));
        System.out.println("Guess the generated random number: ");
        int userGuessedRandomNumber = scanner.nextInt();

        // while generated random number IS NOT equal to user guessed random number, print "Try again"
        while (!(generatedRandomNumber == userGuessedRandomNumber)) {
            if (userGuessedRandomNumber > generatedRandomNumber) {
                System.out.println("The number you are guessing is smaller. Try again!");
            } else if (userGuessedRandomNumber < generatedRandomNumber) {
                System.out.println("The number you are guessing is bigger. Try again!");
            }
            userGuessedRandomNumber = scanner.nextInt();
        }

        //when generated random number IS EQUAL to user guessed random number, then congratulate
            System.out.println("Congratulations! You guessed the random number!");
    }
}

