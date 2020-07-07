package hw5Q2Abstraction03;

//extends and implements keyword is used in Java, but in an Abstract class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class. 
public abstract class MedicalSchool extends NursingSchool {
	// extends keyword is used to inherit a regular class or an abstract class in abstract class
	// multiple inheritance is not possible by extends keyword in abstract class
	// extends keyword can't inherit an interface in abstract class
	
	public MedicalSchool() {
		System.out.println("This is from default constructor of MedicalSchool");
	}
	public void anatomyLab() {
		System.out.println("We have anatomy lab");
	}
	public abstract void biochemistryLab();

}
