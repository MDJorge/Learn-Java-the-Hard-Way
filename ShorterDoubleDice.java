import java.util.Random;

public class ShorterDoubleDice
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int num1 = 1 + r.nextInt(6);
		int num2 = 1 + r.nextInt(6);
		
		int ans = num1 + num2;
		
		System.out.println("HERE COMES THE DICE!");
		System.out.println();
		
		do
		{
			num1 = 1 + r.nextInt(6);
			num2 = 1 + r.nextInt(6);
			ans = num1 + num2;
			System.out.println("Roll #1: " + num1);
			System.out.println("Roll #2: " + num2);
			System.out.println("The total is " + ans + "!");
		} while (num1 != num2);
	}
}