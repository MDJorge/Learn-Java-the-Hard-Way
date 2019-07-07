import java.util.Scanner;
import java.io.File;

public class SimpleFileInput
{
	public static void main( String[] args ) throws Exception
	{
		Scanner text = new Scanner(new File("name.txt"));
		String name = text.next();
		String name2 = text.next();
		String name3 = text.next();
		System.out.println("Using my psychic powers (aided by reading data from the file), I have");
		System.out.println("determined that your name is " + name + " " + name2 + " " + name3 + ".");
	}
}