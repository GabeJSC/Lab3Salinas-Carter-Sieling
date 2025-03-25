import java.util.Scanner;
import java.lang.Math;

/** NUmber Guess generates a random number and then gives hints based on the users input for 5 tries
 * @author Anthony Sieling
 * @since 3/24/2025
 */
public class guess {


    /** Sets varaibles then begins a loop that continues a number guessing game until the user wants to stop
     * @author Anthony Sieling
     */
    public static void numberGuess() {


        Scanner input = new Scanner(System.in);
        int guessCount = 0;
        int numG = 0;
        int magicNum = 5;
        int hazardWarn = 0;
        String option =  "Y" ;


        magicNum = (int) (Math.random()*100);
        do {

            if (guessCount == 0 && hazardWarn == 0) {
                System.out.println("I'm thinking of a number between 1 and 100");
                System.out.println("Guess what it is. You have 5 tries:");
            }
            hazardWarn = 0;

            if (input.hasNextInt())
                numG= (int) input.nextDouble();
            else {
                input.next();
                System.out.println("Invalid Guess try again");
                hazardWarn = 1;
                guessCount = guessCount -1;
            }

            input.nextLine();
            guessCount ++;

            if (numG < magicNum &&  (guessCount < 5) && hazardWarn == 0){
                System.out.println("Nope too Low Try again (" + (5 - guessCount) + " tries left)");
            }
            if (numG > magicNum &&  (guessCount < 5 && hazardWarn == 0)){
                System.out.println("Nope too high Try again (" + (5 - guessCount) + " tries left)");
            }
            if (numG == magicNum){
                System.out.println("Congrats you Guessed correctly");
                System.out.println("Do you want to play again (y/n) ");

                option = input.nextLine();
                guessCount = 0;
                magicNum = (int) (Math.random()*100);
            }
            else if (guessCount == 5){
                System.out.println("no but nice try the number was "+magicNum);
                System.out.println("Enter Y to play again ");

                option = input.nextLine();

                guessCount = 0;
                magicNum = (int) (Math.random()*100);

            }


        }while (option.equalsIgnoreCase("y")) ;
    }


    public static void main(String[] args) {

numberGuess();
    }
}
