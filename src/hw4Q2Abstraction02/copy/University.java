package hw4Q2Abstraction02.copy;

/*
 02) Copy your previous package "hw3Q2Abstraction01" and rename it to "hw4Q2Abstraction02" inside your HW project and execute the remaining. Read the question very carefully. i) Can you create a Constructor inside the interface? If yes, create default Constructor on each interface. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for Interface?  Can an interface inherit other Interface, or a regular class or abstract class? How many inheritance is possible? Use one of the interface -- University to answer my questions. ii) You have 2 abstract class name --MedicalSchool, EngineeringSchool already. Create another Abstract Class NursingSchool, create 2 methods inside the Abstract Class - one is abstract and another one is the non-abstract name -- hygiene and caring. Print something inside the non-abstract or implemented method. Can you create a Constructor inside Abstract Class? If yes, create default Constructor on each Abstract Class. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance of Abstract Class?  Can an Abstract Class inherit other Abstract Class or a regular class or interface? How many inheritances is possible by an Abstract Class? Use the all of above Abstract Classes (3) to answer my questions. iii) Create a regular Class ColumbiaUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- chemistry and biology. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? iv) Create a regular Class NYUniversity, create 2 methods inside the class - one is abstract and another one is non-abstract name -- anthropology and physics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? v) Create a regular Class RockefellerUniversity, create 2 methods inside the class - one is abstract and another one is the non-abstract name -- maths and statistics. if not possible to create, simply comment out the method and explain why in comment out. Print something inside the non-abstract or implemented method. Can you create a Constructor inside a regular Class? If yes, create default Constructor. If no, comment out the created constructor and answer why not? Now, answer how many keywords are used for the inheritance for a regular Class?  Can a regular Class inherit other Abstract Class or regular class or interface? How many inheritances is possible by a regular Class? Use the above regular Classes to answer my questions. You don't need to execute anything as the main method is absent. Paste your Abstraction github link below 
 */

public interface University extends College, Hospital{
	// Interface use extends keyword to inherit more than one Interfaces
	// Interface can't inherit abstract or regular class by extends keyword
	public void classSize();
	public void field();
	public void teacher();
	// Interfaces cannot have constructors
//	public University() {
//		System.out.println("Interfaces cannot have constructors");
//	}
	

}
