import java.util.Random;

public class BabyBlackjack
{
	public static void main( String[] args )
	{
		Random r = new Random();
		int user1 = 1 + r.nextInt( 10 );
		int user2 = 1 + r.nextInt( 10 );
		int deal1 = 1 + r.nextInt( 10 );
		int deal2 = 1 + r.nextInt( 10 );
		
		int userSum = user1 + user2;
		int dealerSum = deal1 + deal2;
		
		System.out.println( "Baby Blackjack!" );
		System.out.println();
		System.out.println( "You drew " + user1 + " and " + user2 + "." );
		System.out.println( "Your total is " + userSum + "." );
		System.out.println();
		System.out.println( "The dealer has " + deal1 + " and " + deal2 + "." );
		System.out.println( "Dealer's total is " + dealerSum + "." );
		System.out.println();
		
		if ( userSum > dealerSum )
		{
			System.out.println("YOU WIN!");
		}
		else
		{
			System.out.println("YOU LOSE!");
		}
	}
}