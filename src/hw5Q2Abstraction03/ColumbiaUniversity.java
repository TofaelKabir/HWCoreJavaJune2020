package hw5Q2Abstraction03;

//extends and implements keyword is used in Java, but in a regular class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public class ColumbiaUniversity extends MedicalSchool implements University {
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
	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void classSize() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void field() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void teacher() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void biochemistryLab() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hygiene() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void computerLab() {
		// TODO Auto-generated method stub
		
	}
}
