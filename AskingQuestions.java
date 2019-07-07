import java.util.Scanner;

public class AskingQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age, feet, inches;
		String height;
		double weight;
		
		System.out.print("How old are you? ");
		age = keyboard.nextInt();
		
		System.out.print("How many feet tall are you? ");
		feet = keyboard.nextInt();
		
		System.out.print("And how many inches? ");
		inches = keyboard.nextInt();
		
		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();
		
		height = feet + "'" + inches + "\"";
		
		System.out.println("So, you're " + age + " years old, have a height of " + height + " and weigh a total of " + weight + " pounds.");
	}
}