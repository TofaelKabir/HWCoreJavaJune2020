package hw6Q2Abstraction04;

/*
 Create one default and one static method gymnasium and library inside interface "University". Create one default and one static method morgue and pharmacy inside interface "Hospital". Create also one default and one static method dorm and studyRoom inside interface "College".
 */

// extends and implements keyword is used in Java, but in interface implements keyword is not used
public interface University extends College, Hospital{
	// Interface use extends keyword to inherit more than one Interfaces
	// Interface can't inherit abstract or regular class by extends keyword
	
	// Interfaces cannot have constructors
//	public University() {
//		System.out.println("Interfaces cannot have constructors");
//	}
	public void classSize();
	public void field();
	public void teacher();
	
	public default void gymnasium() {
		System.out.println("From default method of University");
	}
	
	public static void library() {
		System.out.println("From static method of University");
	}
	
	
}
