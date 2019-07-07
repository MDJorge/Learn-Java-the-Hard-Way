import java.util.Scanner;

public class WorstGuessing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int ans = 4;
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!");
		System.out.println();
		
		System.out.print("I\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS! ");
		int guessed = keyboard.nextInt();
		
		System.out.println();
		
		if (guessed == 4)
		{
			System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + ans + "!");
		}
		else
		{
			System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + ans + "!");
		}
	}
}