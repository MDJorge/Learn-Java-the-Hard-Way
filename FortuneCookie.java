import java.util.Random;

public class FortuneCookie
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int saying = 1 + r.nextInt(6);
		int num1 = 1 + r.nextInt(54);
		int num2 = 1 + r.nextInt(54);
		int num3 = 1 + r.nextInt(54);
		int num4 = 1 + r.nextInt(54);
		int num5 = 1 + r.nextInt(54);
		int num6 = 1 + r.nextInt(54);
		
		if (saying == 1)
		{
			System.out.println("You will find love.");
		}
		else if (saying == 2)
		{
			System.out.println("Happiness comes from inside.");
		}
		else if (saying == 3)
		{
			System.out.println("Appreciate what you have.");
		}
		else if (saying == 4)
		{
			System.out.println("Find meaning in the meaningless.");
		}
		else if (saying == 5)
		{
			System.out.println("Stop and smell the roses every-once in awhile.");
		}
		else if (saying == 6)
		{
			System.out.println("You only live life once. Live it without regret.");
		}
		
		System.out.println("Lotto Numbers:    " + num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6);
	}
}