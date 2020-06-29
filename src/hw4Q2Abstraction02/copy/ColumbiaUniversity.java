package hw4Q2Abstraction02.copy;

public class ColumbiaUniversity extends NYUniversity {
	// extends keyword is used to inherit a regular class or an abstract class in regular class
			// here it extends a REGULAR class
			// multiple inheritance is not possible by extends keyword in regular class
			//extends keyword can't inherit an interface in regular class
	public ColumbiaUniversity() {
		System.out.println("This is from default constructor of ColumbiaUniversity");
	}
	public void chemistry() {
		System.out.println("Math department");
	}
	// public abstract void biology(); 
	// The abstract method statistics in type ColumbiaUniversity can only be defined by an abstract class
	// not by a regular class
}
