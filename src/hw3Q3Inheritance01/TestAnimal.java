package hw3Q3Inheritance01;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		
		Birds birds = new Birds();
		birds.birdsInfo();
		
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		
		Dog dog = new Dog();
		dog.dogInfo();
		
		Robin robin = new Robin();
		robin.robinInfo();
		
		Snake snake = new Snake();
		snake.snakeInfo();

	}

}
