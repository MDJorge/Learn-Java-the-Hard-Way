public class MoreVariablesAndPrinting
{
	public static void main(String[] args)
	{
		String name, eyes, hair;
		int age, height, weight;
		double metricheight, metricweight;
		
		name = "Jorge MD";
		age = 15;
		height = 72; //inches lol
		weight = 108; //lbs
		eyes = "brown";
		hair = "black";
		
		metricheight = height * 2.54;
		metricweight = weight / 2.20462;
		
		System.out.println("Let's talk about " + name + ".");
		System.out.println("He's " + age + " years old.");
		System.out.println("His height is " + height + " inches or " + metricheight + " in cm.");
		System.out.println("And he weighs " + weight + " pounds aka " + metricweight + " kg.");
		System.out.println("He else has " + eyes + " eyes, and " + hair + " hair.");
		
		System.out.println("If I add " + age + ", " + height + ", and " + weight + " I get " + (age + height + weight) + ".");
		System.out.println("If I add " + age + ", " + metricheight + ", and " + metricweight + " I get " + (age + metricheight + metricweight) + ".");
		
	}
}