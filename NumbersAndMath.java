public class NumbersAndMath
{
	public static void main(String[] args)
	{
		System.out.println("I will now count my chickens");
		
		System.out.println("Hens " + (25f + 30f / 6f));
		System.out.println("Roosters " + (100f - 25f * 3f %4f));
		
		System.out.println("Now I will count the eggs:");
		
		System.out.println(3f + 2f + 1f - 5f + 4f % 2f -1f / 4f + 6f);
		

		System.out.println("Is it true that 3 + 2 < 5 - 7?");

		System.out.println(3f + 2f < 5f - 7f);

		System.out.println("What is 3 + 2? " + ( 3f + 2f ));
		System.out.println("What is 5 - 7? " + ( 5f - 7f ));

		System.out.println("Oh, that's why it's false.");

		System.out.println("How about some more.");

		System.out.println("Is it greater? " + ( 5f > -2f ));
		System.out.println("Is it greater or equal? " + ( 5f >= -2f ));
		System.out.println("Is it less or equal? " + ( 5f <= -2f ));
	}
}