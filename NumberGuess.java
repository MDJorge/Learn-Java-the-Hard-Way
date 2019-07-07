import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int ans = 1 + r.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		
		System.out.print("Your guess: ");
		int guessed = keyboard.nextInt();
		
		System.out.println();
		
		if (guessed == ans)
		{
			System.out.println("That's right!  My secret number was " + ans + ".");
		}
		else
		{
			System.out.println("Sorry, but I was really thinking of " + ans + ".");
		}
	}
}