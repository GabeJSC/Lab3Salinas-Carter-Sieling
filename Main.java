import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void welcome () { //message to welcome user and wish them good luck
        System.out.println("Hello! would you like to play a game of Rock, Paper, Scissors?");
        System.out.println("1.Yes!");
        System.out.println("2.No!");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if (choice == 1) {

        }
    }

    public

    public static void main (String[] args) {

        Random random = new Random();
        int seed = random.nextInt();
        random.setSeed(seed);
        for (int i=0; i < 3; i++)
            System.out.print(random.nextInt() + " ");
    }
}