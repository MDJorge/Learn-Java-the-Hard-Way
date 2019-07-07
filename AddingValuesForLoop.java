import java.util.Scanner;

public class AddingValuesForLoop
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int sum = 0;
		System.out.print( "Number: " );
		int num = keyboard.nextInt();
		
		for ( int x = 1; x <= num; x += 1 )
		{
			System.out.print(x + " ");
			sum += x;
		}
		System.out.println();
		System.out.println("The sum is " + sum + ".");
	}
}