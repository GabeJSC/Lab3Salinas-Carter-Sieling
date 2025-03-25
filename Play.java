/***
 * Lab 3 Partner 10
 * Description: This program is a combined effort that will have the user play a game of rock, paper, scissors
 * or try their luck in a guessing game
 * @author Gabriel Salinas-Carter
 * @author Anthony Sieling
 * @since 03/19/25
 */

import java.util.Random;
import java.util.Scanner;

public class Play {
    public static void welcome(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome! thank you for choosing our program.");
        System.out.println("You will be given the choice to play either a guessing game or rock, paper, scissors.");
        System.out.println("Please choose which ever one you would like and play for as long as you want.");
        System.out.println("Good luck and have fun!");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public static void rockPaperScissors() {
        boolean playAgain = true;
        while (playAgain) {
            Scanner scanner = new Scanner(System.in);//Creates scanner object for user input
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Please pick a number");//User options for Rock,Paper, Scissors
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            int userChoice = scanner.nextInt();

            Random random = new Random();//Generates Computers choice at random
            int computerChoice = random.nextInt(3) + 1;//Bounds it to 1-3

            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("You chose " + choiceToString(userChoice));//Displays users choice
            System.out.println("Computer chose " + choiceToString(computerChoice));//Displays Computers choice
            String result = winner(userChoice, computerChoice);
            System.out.println(result);
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Would you like to play again? (yes/no)");
            while (true) {
                String playAgainChoice = scanner.next().toLowerCase();//User inputs if they would like to play again

                if (playAgainChoice.equals("yes")) {
                    playAgain = true;//Plays again if user chooses yes
                    break;//Exits loop and plays again
                }
                else if (playAgainChoice.equals("no")) {
                    playAgain = false;//Ends game if user chooses no
                    System.out.println("Thank you for playing!");
                    break;//Exits loop and ends the game
                } else {
                    System.out.println("Invalid choice! Please type yes or no.");//Error message if invalid input
                }
            }
        }
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
}
