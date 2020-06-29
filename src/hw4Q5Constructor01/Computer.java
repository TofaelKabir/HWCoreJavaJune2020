package hw4Q5Constructor01;

/*
 05) Create a package name "hw4Q5Constructor01" in HW project. Inside the package, a) Create a class "Computer". Declare some variable -- Brand, Model, Operating system, price, madeInUSA, grade (as char). Declare default constructor and multiple parameterized constructor. Use only one System.out.println() in each constructor. Create another class TestComputer. Create object as many as you want under main method. Initialize constructors. I want the first outcome in console as --> This is from default Constructor of Computer class. Second outcome -- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? : false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. Paste your constructor github link below
 * */

public class Computer {
	public String Brand;
	public String Model;
	public String operatingStringSystem;
	public int price;
	public char grade;
	public boolean madeInUsa;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}

	public Computer(boolean madeInUsa) {
		this.madeInUsa = madeInUsa;
		System.out.println("Made in USA? :" + madeInUsa);
	}

	public Computer(String brand, String model, int price) {
		this.Brand = brand;
		this.Model = model;
		this.price = price;
		System.out.println("My Brand: " + brand + ", Model:" + model + ", Price:" + price);
	}

	public Computer(String brand, String model, String operatingStringSystem, int price, char grade) {
		this.Brand = brand;
		this.Model = model;
		this.operatingStringSystem = operatingStringSystem;
		this.price = price;
		this.grade = grade;
		System.out.println("My Brand: " + brand + ", Model:" + model + ", Operating system: " + operatingStringSystem + ", Price:" + price + ", Grade:" + grade);
	}

	public Computer(String brand, String model, String operatingStringSystem, int price, char grade,
			boolean madeInUsa) {
		this.Brand = brand;
		this.Model = model;
		this.operatingStringSystem = operatingStringSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUsa = madeInUsa;
		System.out.println("My Brand: " + brand + ", Model:" + model + ", Operating system: " + operatingStringSystem + ", Price:" + price + ", Grade:" + grade + "and Made in USA? :" + madeInUsa);
	}

}
