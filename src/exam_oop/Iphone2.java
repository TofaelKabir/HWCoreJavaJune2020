package exam_oop;

/*
07) Again, from Iphone1, we got 4 private variables we know. Create 2 constructors inside it -- default and parameterized after those variables. In IPhone2, declare a char variable userOfIphone2 (M or F). create default and parameterized constructor, a regular method iPhone2Info, a parameterized method with same name iPhone2Info inside Iphone2. Use the super keyword in constructor and methods in Iphone2. Call constructor and methods. Can you call variable by super keyword? create a public variable inside Iphone1 and execute it in Iphone2. Execute all of them in TestPhone. [points: 30]
 * */

public class Iphone2 extends Iphone1 {

	public char userOfIphone2;

	public Iphone2() {
		// super();
		super(850, "Iphone2", 'A', false);
		super.regularClassInfo();
		super.interfaceInfo();
		super.abstractClassInfo();
		super.compass();
		super.appleWatchInfo();
		super.digitalWatch();
		super.watch();
		super.camera();
		super.message();
		super.call();
		super.interfaceInfo();
		super.wakitaki();
		super.pager();
		System.out.println("The family of Iphone2 is: " + super.family);
		System.out.println("Default constructor of Iphone2");
	}

	public Iphone2(char userOfIphone2) {
		super();
		// super(950, "Iphone2", 'A', false);
		super.regularClassInfo();
		super.interfaceInfo();
		super.abstractClassInfo();
		super.compass();
		super.appleWatchInfo();
		super.digitalWatch();
		super.watch();
		super.camera();
		super.message();
		super.call();
		super.interfaceInfo();
		super.wakitaki();
		super.pager();
		System.out.println("The family of Iphone2 is: " + super.family);
		this.userOfIphone2 = userOfIphone2;
		System.out.println("Parameterized constructor of Iphone2. User Of Iphone2 is: " + userOfIphone2);
	}

	public void mail() {
		System.out.println("mail method from Iphone2 class");
	}

	public void iPhone2Info() {
		super.regularClassInfo();
		super.interfaceInfo();
		super.abstractClassInfo();
		super.compass();
		super.appleWatchInfo();
		super.digitalWatch();
		super.watch();
		super.camera();
		super.message();
		super.call();
		super.interfaceInfo();
		super.wakitaki();
		super.pager();
		System.out.println("The family of Iphone2 is: " + super.family);
		System.out.println("IPhone2Info method from Iphone2 class");
	}
	
	public void iPhone2Info(char userOfIphone2) {
		super.regularClassInfo();
		super.interfaceInfo();
		super.abstractClassInfo();
		super.compass();
		super.appleWatchInfo();
		super.digitalWatch();
		super.watch();
		super.camera();
		super.message();
		super.call();
		super.interfaceInfo();
		super.wakitaki();
		super.pager();
		System.out.println("The family of Iphone2 is: " + super.family);
		this.userOfIphone2 = userOfIphone2;
		System.out.println("Parameterized method of Iphone2. User Of Iphone2 is: " + userOfIphone2);
	}

}
