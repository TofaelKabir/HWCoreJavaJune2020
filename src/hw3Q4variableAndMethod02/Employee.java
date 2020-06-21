package hw3Q4variableAndMethod02;
/*
04) Create a package name "hw3Q4variableAndMethod02" in HW project. Inside the package, a) Create a class "Employee". Declare non static variable -- Name, age, sex and usaCitizen as String, int, char and boolean type. Implement a non static method inside the class -- empInfo and use only one System.out.println(). Use the variables inside sysout. Create another class TestEmployee. Create object under main method. Initialize object and method. I want the first outcome in console as --> My name: Tofael, Age: 44, Sex: M and USA Citizen status: false. I want second outcome in console for your info. So, Total 2 outcome is  expecting  from the test class. Paste your code below
 * */

public class Employee {
	public String Name;
	public int age;
	public char sex;
	public boolean usaCitizen;
	
	public void empInfo() {
		System.out.println("My name: "+Name+", Age: "+age+", Sex: "+sex+" and USA Citizen status: "+usaCitizen);
	}

}
