import java.util.Scanner;
import java.io.File;

public class SummingThreeNumbersFromAnyFile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner( System.in );
		System.out.print("Which file would you like to read numbers from: ");
		String fileName = keyboard.next();
		System.out.println("Reading numbers from file \"" + fileName + "\"");
		System.out.println();
		
		Scanner nums = new Scanner( new File(fileName) );
		int num1 = nums.nextInt();
		int num2 = nums.nextInt();
		int num3 = nums.nextInt();
		
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + ( num1 + num2 + num3));
	}
}