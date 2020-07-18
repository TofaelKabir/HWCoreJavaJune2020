package hw7Q2Polymorphism;

public class Cousin2 extends Cousin1 {
	// summary: same method name, same signature/parameter but Overriding the logic of the method
	// Method overriding(same method name, same parameter but different syntax or logic)
	// Also called -- Late binding or dynamic binding or runtime polymorphism
	@Override
	public void ageOfCousins() {
		System.out.println("Age is: 470");
	}

	@Override
	public void ageOfCousins(int age1, int age2) {
		int total = age1 + age2 + 480;
		System.out.println("Age is: " + total);
	}

	@Override
	public int ageOfCousins(int age1, int age2, int age3) {
		int total = age1 + age2 + age3 + 488;
		System.out.println("Age is: " + total);
		return total;
	}
// static method can't be override as this is the local method of Cousin1 class.	
//	@Override
//	public static int ageOfCousins(int age1, int age2, int age3, String age4) {
//		int total = age1 + age2 + age3 + Integer.parseInt(age4) + 501;
//		System.out.println("Age is: " + total);
//		return total;
//	}
// final method can't be override as the method is final in Cousin1 class.
//	@Override
//	public final int ageOfCousins(int age1, int age2, int age3, String age4, int age5) {
//		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + 502;
//		System.out.println("Age is: " + total);
//		return total;
//	}

}
