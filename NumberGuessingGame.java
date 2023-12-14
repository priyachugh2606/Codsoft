import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        do {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int guess;
            int remainingAttempts = attempts;
            System.out.println("I'm thinking of a number between " + minRange + " and " + maxRange + ".");
            System.out.println("You have " + remainingAttempts + " attempts to guess the number.");
            while (remainingAttempts > 0)
            {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();
                if (guess == randomNumber)
                {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score++;
                    break;
                } else if (guess < randomNumber)
                {
                    System.out.println("Too low! Try again.");
                } else
                {
                    System.out.println("Too high! Try again.");
                }
                remainingAttempts--;
                System.out.println("Remaining attempts: " + remainingAttempts);
            }
            if (remainingAttempts == 0)
            {
                System.out.println("Sorry, you ran out of attempts. The correct number was " + randomNumber + ".");
            }
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));
        System.out.println("Thank you for playing the Number Guessing Game!");
        System.out.println("Final score: " + score);
    }
}