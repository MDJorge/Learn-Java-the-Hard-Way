import java.util.Scanner;
import java.io.File;

public class SummingThreeNumbersFromAFile
{
	public static void main( String[] args) throws Exception
	{
		Scanner nums = new Scanner( new File("3nums.txt") );
		int num1 = nums.nextInt();
		int num2 = nums.nextInt();
		int num3 = nums.nextInt();
		System.out.println("Reading numbers from file \"3nums.txt\"... done.");
		System.out.println();
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
	}
}