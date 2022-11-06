package OOP;

import java.util.Scanner;

public class RockPaperScissorsVers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ask user inputs
        System.out.println("Player 1, enter your hand sign:");
        String player1 = scanner.nextLine().toLowerCase().trim();
        System.out.println("Player 2, enter your hand sign");
        String player2 = scanner.nextLine().toLowerCase().trim();

        System.out.println(rockPaperScissorsVers2(player1,player2));

    }

    public static String rockPaperScissorsVers2(String player1, String player2) {
        String answer;
        if (!checkInputValid(player1, player2)) {
            return "Input values are nor valid";

        }

        if (player1.equals("paper") && player2.equals("rock")
                || player1.equals("scissors") && player2.equals("paper")
                || player1.equals("rock") && player2.equals("scissors")) {
            answer = "Player 1 wins!";

        } else if (player1.equals(player2)) {
            answer = "It's a tie!";

        } else {
            answer = "Player 2 wins!";
        }
        return answer;
    }

    public static boolean checkInputValid(String player1, String player2){
        return player1.matches("rock|scissors|paper") && player2.matches("rock|scissors|paper");
    }
}
