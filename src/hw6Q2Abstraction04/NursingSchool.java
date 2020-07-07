package hw6Q2Abstraction04;

/*
 Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class?  Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions.
 * */

//extends and implements keyword is used in Java, but in an Abstract class, implements keyword is used
//to inherit Interface and extends keywords to inherit a regular class or an abstract class.
public abstract class NursingSchool extends RockefellerUniversity {
	// extends keyword is used to inherit a regular class or an abstract class in
	// abstract class
	// multiple inheritance is not possible by extends keyword in abstract class
	// extends keyword can't inherit an interface in abstract class
	public NursingSchool() {
		System.out.println("This is from default constructor of NursingSchool");
	}

	public void caring() {
		System.out.println("Caring department");

	}

	public abstract void hygiene();

}
