public class NoticingEvenNumbers
{
	public static void main( String[] args )
	{
		for ( int start = 1; start <= 20; start += 1 )
		{
			if ( start % 2 == 0 )
			{
				System.out.println(start + " <");
			}
			else
			{
				System.out.println(start);
			}
		}
	}
}