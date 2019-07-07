import java.util.Scanner;

public class AddingValuesInALoop
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int total, input;
		total = 0;
		input = -1;
		
		System.out.println("I will add up the numbers you give me.");
		
		while (input != 0)
		{
			input = 0;
			System.out.print("Number: ");
			input = keyboard.nextInt();
			total += input;
			System.out.println("The total so for is " + total);
		}
		
		System.out.println("The total is " + total);
	}
}