package hw6Q2Abstraction04;

/*
ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool.
 * */
//extends and implements keyword is used in Java, but in a regular class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public class ColumbiaUniversity extends MedicalSchool implements University, VocationalSchool {
	// extends keyword is used to inherit a regular class or an abstract class in
	// regular class
	// here it extends a REGULAR class
	// multiple inheritance is not possible by extends keyword in regular class
	// extends keyword can't inherit an interface in regular class
	public ColumbiaUniversity() {
		System.out.println("This is from default constructor of ColumbiaUniversity");
	}

	public void chemistry() {
		System.out.println("Math department");
	}

	// public abstract void biology();
	// The abstract method statistics in type ColumbiaUniversity can only be defined
	// by an abstract class
	// not by a regular class
	@Override
	public void commonRoom() {
		System.out.println("Abstract method of College Interface");
	}

	@Override
	public void laboratory() {
		System.out.println("Abstract method of College Interface");

	}

	@Override
	public void languageClub() {
		System.out.println("Abstract method of College Interface");

	}

	@Override
	public void cafeteria() {
		System.out.println("Abstract method of Hospital Interface");
	}

	@Override
	public void emergencyRoom() {
		System.out.println("Abstract method of Hospital Interface");
	}

	@Override
	public void surgeryRoom() {
		System.out.println("Abstract method of Hospital Interface");
	}

	@Override
	public void classSize() {
		System.out.println("Abstract method of University Interface");

	}

	@Override
	public void field() {
		System.out.println("Abstract method of University Interface");

	}

	@Override
	public void teacher() {
		System.out.println("Abstract method of University Interface");

	}

	@Override
	public void VocationalInfo() {
		System.out.println("Abstract method of Vocational School Interface");

	}

	@Override
	public void biochemistryLab() {
		System.out.println("Abstract method of MedicalSchool abstract class ");

	}

	@Override
	public void hygiene() {
		System.out.println("Abstract method of NursingSchool abstract class ");

	}

	@Override
	public void computerLab() {
		System.out.println("Abstract method of EngineeringSchool abstract class ");

	}

}
