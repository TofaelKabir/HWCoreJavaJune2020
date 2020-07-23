package exam_oop;

/*
 02) Create a package 'exam_oop' and paste me the GitHub link below: The code needs to prepare according to the question: 
Phone is an interface that has four abstract method interfaceInfo, call, message, camera and 2 non abstract method - battery and wireless which are implemented. from this 2 method -- print out what type of method they are. [for example -- "battery is a ...... method from Java ....."]. When you get a chance to implement interfaceInfo, print out answers for the following questions: [What are the features of Interface you know? Can we create a constructor inside an interface? Can we write variables inside Interface? Don't copy-paste, write how much you can remember, use newline (\n), tab(\t)], for other abstract methods, also print whatever you like. Do you think we can extends or implements Interface? Single or multiple? Create two interface Pager and Wireless and One regular class name LandPhone and one abstract class satelitePhone. make a relation of this 4, with Phone if possible.  [points: 30] .
 * */

// We can extends multiple Interface, can't extends or implements regular or abstract class
public interface Phone extends Pager, Wakitaki {
	
	// We can write variables inside Interface
    String Name = "Tofael"; // variables look bold, variables are final and static
	public final String CompanyName = "MTKS";
	public static int yearlySalary = 120000;
	public int monthlySalary = 10000;
	
	// Interfaces cannot have constructors

//	public Phone(){
//		System.out.println("Interfaces cannot have constructors");
//	}
	
	public void interfaceInfo(); 
	public void call(); 
	public void message();
	public void camera();

	public default void battery() {
		System.out.println("battery is a deault method from Java 1.8");
	}
	public static void wireless() {
		System.out.println("wireless is a static method from Java 1.8");
	}

}
