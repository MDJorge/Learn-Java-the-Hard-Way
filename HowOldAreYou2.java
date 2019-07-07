import java.util.Scanner;

public class HowOldAreYou2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hey, what's your name? ");
		String name = keyboard.next();
		
		System.out.println("");
		
		System.out.print("Ok, " + name + ", how old are you? ");
		int age = keyboard.nextInt();
		
		System.out.println("");
		
		if (age < 16)
		{
			System.out.println("You can't drive, " + name + ".");
		}
		
		if (age > 15 && age < 18)
		{
			System.out.println("You can drive, but you can't vote, " + name + ".");
		}
		
		if (age > 17 && age < 25)
		{
			System.out.println("You can vote, but you can't rent a car, " + name + ".");
		}
		
		if (age >= 25)
		{
			System.out.println("You can pretty much do anything");
		}
	}
}