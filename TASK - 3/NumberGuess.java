import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        do 
        {
            int ran_num = ran.nextInt(100) + 1;
            int max_attempts = 3;
            int min_attempts = 1;
            int guess_no;

            while (min_attempts <= max_attempts) 
            {
                System.out.print("Enter Your Guess Number (1 - 100) : ");
                guess_no = sc.nextInt();
                min_attempts++;

                if (guess_no == ran_num) 
                {
                    System.out.println("\n =====>> Congratulations! You Guessed The Correct Number " + ran_num +
                            " In " + (min_attempts - 1) + " Attempts. <<====\n");
                    break;
                } 
                else if (guess_no < ran_num) 
                {
                    System.out.println("Too Low! Try Again.");
                }
                else 
                {
                    System.out.println("Too High! Try Again.");
                }
            }

            if (min_attempts > max_attempts) 
            {
                System.out.println("\n =====>> Sorry, Attempts Is Over!! The Correct Number Is : " + ran_num + " <<====\n");
            }
            System.out.print("Do you want to play again? (yes/no): ");
        }
        while (sc.next().equalsIgnoreCase("yes"));

        System.out.println("====>>  Thanks For Playing!  <<====");
    }
}

