import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int ans = 1 + r.nextInt(10);
		int tries = 1;
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");

		int guessed = keyboard.nextInt();
		
		do
		{
			System.out.print("Your guess: ");
			guessed = keyboard.nextInt();
			tries++;
			if (guessed != ans)
			{
				System.out.println("That is incorrect. Guess again.");
			}
			else
			{
				System.out.println("That's right!  You're a good guesser.");
				System.out.println("It only took you " + tries + " tries.");
			}
		}  while (guessed != ans);
	}
}