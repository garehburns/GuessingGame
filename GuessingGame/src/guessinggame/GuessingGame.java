package guessinggame;
import java.util.Scanner;
public class GuessingGame {

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100...");
        
        int number = (int)(Math.random() * 100) + 1;
        boolean win = false;
        int guesses = 0;
        
        while (win == false) {

            System.out.print("Please guess a number: ");
            
            Scanner in = new Scanner(System.in);
            int guess = in.nextInt();
            guesses++;
            
            if (guess == number)
                win = true;
            
            else if (guess > number)
                System.out.println(guess + " is too high.");
            
            else if (guess < number)
                System.out.println(guess + " is too low.");
        }
        
        System.out.println("Congratulations! You Guessed the number in " + guesses + " guess(es)!");
    }
}