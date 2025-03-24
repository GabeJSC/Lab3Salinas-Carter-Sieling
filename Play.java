
import java.util.Random;
import java.util.Scanner;

public class Play {

    public static void startGame() {
        Scanner scanner = new Scanner(System.in); //Creates scanner object for user input
        System.out.println("Please pick a number");//User options for Rock,Paper, Scissors
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int userChoice = scanner.nextInt();

        Random random = new Random();//Generates Computers choice at random
        int computerChoice = random.nextInt(3) + 1;//Bounds it to 1-3

        System.out.println("You chose " + choiceToString(userChoice));//Displays users choice
        System.out.println("Computer chose " + choiceToString(computerChoice));//Displays Computers choice
        String result = winner(userChoice, computerChoice);
        System.out.println(result);
    }

    public static String choiceToString(int choice) {//Converts int choice to string
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }

    public static String winner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "Tie";
        } else if ((userChoice == 1 && computerChoice == 3) || //Rock beats Paper
                (userChoice == 2 && computerChoice == 1) || //Paper beats rock
                (userChoice == 3 && computerChoice == 2)) { // Scissors beat paper
            return "You win!";
        } else {
            return "You lose!";
        }
    }

    public static void main(String[] args) {
        startGame();
    }
}
