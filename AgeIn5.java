import java.util.Scanner;

public class AgeIn5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hello. What is your name? ");
		String name = keyboard.next();
		
		System.out.println("");
		
		System.out.print("Hi, " + name + "! How old are you? ");
		int age = keyboard.nextInt();
		
		System.out.println("");
		
		int pastAge = age - 5;
		int futureAge = age + 5;
		
		System.out.println("Did you know that in five years you will be " + futureAge + " years old?");
		System.out.println("And five years ago you were " + pastAge + "! Imagine that!");
	}
}