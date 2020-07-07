package hw5Q2Abstraction03;

//extends and implements keyword is used in Java, but in an Abstract class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public abstract class EngineeringSchool extends NYUniversity {
	// extends keyword is used to inherit a regular class or an abstract class in abstract class
	// here it extends a regular class
	// multiple inheritance is not possible by extends keyword in abstract class
	//extends keyword can't inherit an interface in abstract class
	public EngineeringSchool() {
		System.out.println("This is from default constructor of EngineeringSchool");
	}
	public void mechanicalLab() {
		System.out.println("We have a mechanical lab");
	}
	public abstract void computerLab();

}
