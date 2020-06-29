package hw4Q3Inheritance02;
/*
 03) Copy your previous package "hw3Q3Inheritance01" and rename it to "hw4Q3Inheritance02" inside your HW project and execute the remaining. Read the question very carefully. h) Create another class "BullDog". Implement a method inside the class -- bullDogInfo and System.out.println("This method is from BullDog Class"). i) Create another class "Cobra". Implement a method inside the class -- cobraInfo and System.out.println("This method is from Cobra Class"). Now create a class "TestAnimal". Under the main method create an object from each class and call their own method by their own object. Now extends BullDog, Cobra, and Robin class and shows their hierarchy till Animal Class, for example: bulldog -- dog -- mammal --Animal. An object Can call other methods if the class is extended, if yes, show all the possible calls. Use Java comments to show single inheritance, multiple inheritance, Hierarchical inheritance by example form above. Also, show by java comments who is Parent class and who is child class. Paste your inheritance github link below
 */

public class Animal {
	public void animalInfo() {
		System.out.println("This method is from Animal Class");
	}

}
