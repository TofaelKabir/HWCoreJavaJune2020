package hw7Q2Polymorphism;

/*
 02) Create a package "hw7Q2Polymorphism" inside your HW project and execute the remaining. Read the question very carefully. Create a class Cousin1. Can you create several methods with the same name inside it? Give the method name ageOfCousins. use int age1, int age2,int age3, String age4, int age5,int age6 etc as variable. Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. Tell me what is the Method overloading. initialize all the methods in TestFamily class. Create another class Cousin2 and inherit Cousin1. Override all the possible methods by changing logic. If some methods are not possible to override, please explain why by comments. Initialize all the methods in TestFamily class.
 * */

public class Cousin1 {
	// Method overloading -- (same method name but different type of
	// parameter/signature or different combination of parameter)
	// Different name: Early binding or static binding or compile time polymorphism.
	public void ageOfCousins() {
		System.out.println("Age is: 87");
	}

	public void ageOfCousins(int age1, int age2) {
		int total = age1 + age2;
		System.out.println("Age is: " + total);
	}

	public int ageOfCousins(int age1, int age2, int age3) {
		int total = age1 + age2 + age3;
		System.out.println("Age is: " + total);
		return total;
	}

	public static int ageOfCousins(int age1, int age2, int age3, String age4) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4);
		System.out.println("Age is: " + total);
		return total;
	}

	public final int ageOfCousins(int age1, int age2, int age3, String age4, int age5) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("Age is: " + total);
		return total;
	}

}
