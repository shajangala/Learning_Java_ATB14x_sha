package ex_11_While;
import java.util.*;

public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        Random random = new Random();
        int numberToGuess = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to guess the random number from 1 to 100:");
        int guess;
        int attempts=0;
        while (true)
        {
            if (!scanner.hasNextInt())
            {
                System.out.println("Invalid input! Please enter a number from 1-100");
                scanner.next();
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if(guess < 1 || guess > 100)
            {
                System.out.println("Please enter a number from 1 to 100");
                continue;
            }
            if(guess < numberToGuess)
            {
                System.out.println("Too low, try again");
            }
            else if(guess > numberToGuess)
            {
                System.out.println("Too high, try again");
            }
            else
            {
                System.out.println("Correct! you guess the number in "+ attempts + "attempts");
                System.out.println(numberToGuess);
                break;
            }
        }
    }
}
