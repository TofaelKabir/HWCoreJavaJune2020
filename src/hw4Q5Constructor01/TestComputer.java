package hw4Q5Constructor01;

public class TestComputer {

	public static void main(String[] args) {
		Computer computer01 = new Computer();
		Computer computer02 = new Computer(true);
		Computer computer03 = new Computer("Dell", "5360", 860);
		Computer computer04 = new Computer("Apple", "MacBook Air", "MacOS", 900, 'A');
		Computer computer05 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'C', false);
		Computer computer06 = new Computer("Dell", "12", "Windows", 750, 'B', false);
		
		

	}

}
