package StarterExercises;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int guess = 200;
        int numOfGuesses = 0, personalBest = 100;
        int rng = new Random().nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);

        System.out.println("Random Number guessing game. Guess a number 1-100. (int)");
        while(true){

            try {
                System.out.print("guess: ");
                guess = scan.nextInt();
            } catch (RuntimeException e) {
                System.out.println("enter a valid number ");
                scan.next();
                continue;
            }
            numOfGuesses ++;
            if (rng == guess){
                System.out.println("\nCongratulations you won!");
                System.out.println("Number of guesses used: " + numOfGuesses);
                if(numOfGuesses < personalBest) {
                    personalBest = numOfGuesses;
                    System.out.println("New Best score!");
                } else System.out.println("Personal best: " + personalBest);

                System.out.println("\n Play Again? (Y/N): ");
                try {
                    String quitter = scan.nextLine();
                    if (quitter.equalsIgnoreCase("n") || quitter.equalsIgnoreCase("no") ){
                        break;
                    }
                } catch (RuntimeException e) {
                    System.out.println("Unrecognized input. Ending game..");
                    break;
                }

                rng = new Random().nextInt(100) + 1;
                numOfGuesses = 0;

            } else if (rng < guess) {
                System.out.println("the magic number is lower than that");
            } else {
                System.out.println("the magic number is greater than that");
            }

        }

    }
}
