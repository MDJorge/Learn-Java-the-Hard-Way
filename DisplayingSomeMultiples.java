import java.util.Scanner;

public class DisplayingSomeMultiples
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "Choose a number: " );
		int num1 = keyboard.nextInt();
		
		for ( int i = 1; i <= 12; i++ )
		{
			int ans = num1 * i;
			System.out.println( num1 + " x " + i + " = " + ans );
		}
	}
}