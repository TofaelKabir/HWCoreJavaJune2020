package hw4Q3Inheritance02;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("\n------------------------------------------------------");
		Animal animal = new Animal();
		animal.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		
		System.out.println("\n------------------------------------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		

	}

}
