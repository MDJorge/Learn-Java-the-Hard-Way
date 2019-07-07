import java.util.Scanner;

public class BMICalc
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Your height (feet only): ");
		int feet = keyboard.nextInt();
		
		System.out.print("Your height (inches): ");
		int inches = keyboard.nextInt();
		
		System.out.print("Your weight in pounds: ");
		int pounds = keyboard.nextInt();
		
		int totalinches = (feet * 12) + inches;
		double m = totalinches / 39.3701;
		double kg = pounds / 2.20462;
		double squared = m*m;
		double bmi = kg / squared;
		
		System.out.println("");
		
		System.out.println("You have a BMI of: " + bmi);
	}
}