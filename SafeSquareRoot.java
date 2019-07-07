import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number = 0;
		
		System.out.println("SQUARE ROOT!");
		
		do
		{
			System.out.print("Enter a number: ");
			number = keyboard.nextInt();
			
			if (number > 0)
			{
				System.out.println("The square root of " + number + " is " + Math.sqrt(number));
			}
			else if (number < 0)
			{
				System.out.println("You can't take the square root of of a negative number, silly.");
			}
		} while (number < 0);
	}
}