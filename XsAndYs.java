public class XsAndYs
{
	public static void main(String[] args)
	{		
		System.out.println();
		System.out.println(" x      y");
		System.out.println("-----------------");
		
		for ( double x = -10.0; x <= 10; x += 0.5 )
		{
			double y = (x * x);
			if (x == -10.0)
			{
				System.out.println(x + "   " + y);
			}
			else if (x == 10.0)
			{
					System.out.println(x + "    " + y);
			}
			else if (x < 0)
			{
				System.out.println(x + "    " + y);
			}
			else
			{
				System.out.println(x + "     " + y);
			}
		}
		System.out.println();
	}
}