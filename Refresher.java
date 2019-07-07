import java.util.Scanner;

public class Refresher
{
	public static void main( String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print( "What is your name? " );
		String name = keyboard.next();
		System.out.println();
		
		if ( name == "Mitchell" )
		{
			for ( int i = 1; i <= 5; i++ )
			{
				System.out.println( name );
			}
		}
		else
		{
			for ( int x = 1; x <= 10; x++ )
			{
				System.out.println( name );
			}
		}
	}
}