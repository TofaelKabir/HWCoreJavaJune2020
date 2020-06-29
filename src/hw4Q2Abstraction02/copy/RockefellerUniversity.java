package hw4Q2Abstraction02.copy;

public class RockefellerUniversity {
	// extends keyword is used to inherit a regular class or an abstract class in regular class
	// here it extends NO class
	// multiple inheritance is not possible by extends keyword in regular class
	// extends keyword can't inherit an interface in regular class
	public RockefellerUniversity() {
		System.out.println("This is from default constructor of RockefellerUniversity");
	}

	public void maths() {
		System.out.println("Math department");
	}
	// public abstract void statistics();
	// The abstract method statistics in type RockefellerUniversity can only be
	// defined by an abstract class
	// not by a regular class
}
