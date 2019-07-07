import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Count to: ");
		int maxVal = keyboard.nextInt();
		
		for ( int minVal = 0; minVal <= maxVal; minVal += 1 )
		{
			System.out.print(minVal + " ");
		}
		System.out.println();
	}
}