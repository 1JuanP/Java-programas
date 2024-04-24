import java.util.Random;
import java.util.Scanner;

public class rockpapaersisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Enter your move (rock, paper, or scissors). To exit the game, type 'exit': ");
            String playerMove = scanner.next().toLowerCase();

            if (playerMove.equals("exit")) {
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid move, try again.");
                continue;
            }

            int computerMoveInt = random.nextInt(3);
            String computerMove;
            if (computerMoveInt == 0) {
                computerMove = "rock";
            } else if (computerMoveInt == 1) {
                computerMove = "paper";
            } else {
                computerMove = "scissors";
            }

            System.out.println("Computer move: " + computerMove);

            try {
                if (playerMove.equals(computerMove)) {
                    System.out.println("It's a tie.");
                } else if ((playerMove.equals("rock") && computerMove.equals("scissors"))
                        || (playerMove.equals("paper") && computerMove.equals("rock"))
                        || (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                    System.out.println("You win.");
                    playerScore++;
                } else {
                    throw new Exception("You lose.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                computerScore++;
            }

            System.out.println("Score - Player: " + playerScore + ", Computer: " + computerScore);
        }

        scanner.close();
        System.out.println("Game over. Final score - Player: " + playerScore + ", Computer: " + computerScore);
    }
}
