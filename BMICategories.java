import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		String category;
		category = "";
		
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
		
		if (bmi < 15.0)
		{
			category = "very severely underweight";
		}
		else if (bmi >= 15.0 && bmi <= 16.0)
		{
			category = "severely underweight";
		}
		else if (bmi > 16.0 && bmi < 18.5)
		{
			category = "underweight";
		}
		else if (bmi > 18.4 && bmi < 25)
		{
			category = "normal weight";
		}				
		else if (bmi > 24.9 && bmi < 30)
		{
			category = "overweight";
		}				
		else if (bmi > 29.9 && bmi < 35)
		{
			category = "moderately obese";
		}				
		else if (bmi > 34.9 && bmi < 40)
		{
			category = "severely obese";
		}						
		else if (bmi > 40)
		{
			category = "very severely (or \"morbidly\") obese";
		}
		else
		{
			category = "";
		}
		
		System.out.println("You have a BMI of: " + bmi);
		System.out.println("BMI Category: " + category);
	}
}