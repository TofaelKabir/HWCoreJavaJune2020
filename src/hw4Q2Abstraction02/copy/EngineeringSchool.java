package hw4Q2Abstraction02.copy;

public abstract class EngineeringSchool extends RockefellerUniversity {
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
