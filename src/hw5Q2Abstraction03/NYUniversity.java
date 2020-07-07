package hw5Q2Abstraction03;

//extends and implements keyword is used in Java, but in a regular class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public class NYUniversity {
	// extends keyword is used to inherit a regular class or an abstract class in regular class
		// here it extends an abstract class
		// multiple inheritance is not possible by extends keyword in regular class
		//extends keyword can't inherit an interface in regular class
	public NYUniversity() {
		System.out.println("This is from default constructor of NYUniversity");
	}
	public void anthropology() {
		System.out.println("Anthropology department");
	}
	// public abstract void physics(); 
	// The abstract method statistics in type NYUniversity can only be defined by an abstract class
	// not by a regular class
	
	
}
