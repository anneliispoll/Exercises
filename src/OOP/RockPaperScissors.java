package OOP;

import java.util.Scanner;

public class RockPaperScissors {

    private static void rockPaperScissorsLizardSpock() {

        Scanner scanner = new Scanner(System.in);
        //ask user inputs
        System.out.println("Player 1, enter your hand sign:");
        String player1Input = scanner.nextLine();
        System.out.println("Player 2, enter your hand sign");
        String player2Input = scanner.nextLine();

        //compare user inputs
        if (player1Input.equalsIgnoreCase(player2Input)) {
            System.out.println("TIE");
        } else if (player1Input.equalsIgnoreCase("rock") && player2Input.equalsIgnoreCase("paper")) {
            System.out.println("Player 2 wins");
        } else if (player1Input.equalsIgnoreCase("paper") && player2Input.equalsIgnoreCase("rock")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("paper") && player2Input.equalsIgnoreCase("scissors")) {
            System.out.println("Player 2 wins");
        } else if (player1Input.equalsIgnoreCase("scissors") && player2Input.equalsIgnoreCase("paper")) {
            System.out.println("player 1 wins");
        } else if (player1Input.equalsIgnoreCase("rock") && player2Input.equalsIgnoreCase("scissors")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("rock") && player2Input.equalsIgnoreCase("lizard")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("paper") && player2Input.equalsIgnoreCase("Spock")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("scissors") && player2Input.equalsIgnoreCase("lizard")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("lizard") && player2Input.equalsIgnoreCase("Spock")) {
            System.out.println("Player 1 wins");
        } else if (player1Input.equalsIgnoreCase("Spock") && player2Input.equalsIgnoreCase("scissors")) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");

        }
    }
            public static void main(String[]args){

                rockPaperScissorsLizardSpock();
            }
        }

