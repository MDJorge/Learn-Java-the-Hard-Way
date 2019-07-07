import java.util.Scanner;

public class SpaceBoxing
{
	public static double newWeight(int planet)
	{
		double result;
		int weight;
		
		if (planet == 1) //Venus
		{
			result = weight * 0.78;
		}
		else if (planet == 2) //Mars
		{
			result = weight * 0.39;
		}
		else if (planet == 3) //Jupiter
		{
			result = weight * 2.65;
		}		
		else if (planet == 4) //Saturn
		{
			result = weight * 1.17;
		}		
		else if (planet == 5) //Uranus
		{
			result = weight * 1.05;
		}		
		else if (planet == 6) //Neptune
		{
			result = weight * 1.23;
		}
		
		return result;
	}
	
	public static void main(String[] args)
	{
		double newWeight;
		int weight;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter your current \"earth\" weight: ");
		weight = keyboard.nextInt();
		
		System.out.println();
		
		System.out.println("I have information for the following planets: ");
		System.out.println("   1. Venus   2. Mars    3. Jupiter");
		System.out.println("   4. Saturn  5. Uranus  6. Neptune");
		
		System.out.println("Which planet are you visiting? ");
		int planet = keyboard.nextInt();
		
		System.out.println();
		
		System.out.println("Your weight would be " + newWeight + "on that specific planet.");
	}
}