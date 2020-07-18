package hw7Q2Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		System.out.println("\n-------- Method overloading ---------\n");
		Cousin1 cousin1 = new Cousin1();
		cousin1.ageOfCousins();
		cousin1.ageOfCousins(469, 483);
		cousin1.ageOfCousins(469, 483, 494);
		Cousin1.ageOfCousins(469, 483, 494, "500");
		cousin1.ageOfCousins(469, 483, 494, "500", 484);
		
		System.out.println("\n-------- Method overriding ---------\n");
		Cousin2 cousin2 = new Cousin2();
		cousin2.ageOfCousins();
		cousin2.ageOfCousins(469, 483);
		cousin2.ageOfCousins(469, 483, 494);

	}

}
