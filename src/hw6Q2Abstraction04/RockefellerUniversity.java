package hw6Q2Abstraction04;

/*
 02) Copy your previous package "hw5Q2Abstraction03" and rename it to "hw6Q2Abstraction04" inside your HW project and execute the remaining. Read the question very carefully. Create interface VocationalSchool and a method vocationalInfo inside it. Create another interface AeronauticalSchool and a method aeronauticalInfo inside it. See the below inheritance. University extends College, Hospital. ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool. MedicalSchool extends NursingSchool. NursingSchool extends RockefellerUniversity. RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool. EngineeringSchool extends NYUniversity. Follow all the above hierarchy to inherit the methods. Now create a class TestInstitute. Then Instantiate  ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool one by one. Call all the possible methods from ColumbiaUniversity , RockefellerUniversity, University, Hospital, MedicalSchool and NursingSchool. To know about all the regular class, abstract class and interface, see the below question (which were given as HW).
 **/

//extends and implements keyword is used in Java, but in a regular class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public class RockefellerUniversity extends EngineeringSchool implements AeronauticalSchool{
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

	@Override
	public void computerLab() {
		System.out.println("Computer lab of Engineering school");
	}

	@Override
	public void aeronauticalInfo() {
		System.out.println("Aeronotical info of Aeronautical school");
		
	}
}
