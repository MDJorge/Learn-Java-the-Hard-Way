import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Count from: ");
		int minVal = keyboard.nextInt();
		System.out.print("Count to  : ");
		int maxVal = keyboard.nextInt();
		System.out.print("Count by  : ");
		int countBy = keyboard.nextInt();
		System.out.println();
		
		for ( int start = minVal; start <= maxVal; start += countBy )
		{
			System.out.print(start + " ");
		}
		System.out.println();
	}
}