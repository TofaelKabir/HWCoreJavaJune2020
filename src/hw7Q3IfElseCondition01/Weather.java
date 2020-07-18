package hw7Q3IfElseCondition01;

/*
04) Create a class  Weather in package name "hw7Q4IfElseCondition". Initialize temperature -8 (minus 8) as variable. Write conditions for below outcome: The temperature is zero, The temperature is more than 0 and an odd number, the temperature is more than zero and an even number The temperature is less than 0 and an odd number, the temperature is less than zero and an even number. Find out the correct answer from conditions. Paste GitHub link below.
 * */

public class Weather {

	public static void main(String[] args) {
		int temperature = -8;
		if (temperature == 0) {
			System.out.println("The temperature is zero");
		} else if (temperature % 2 == 1 && temperature > 0) {
			System.out.println("The temperature is an odd positive number");
		} else if (temperature % 2 == 0 && temperature > 0) {
			System.out.println("The temperature ia an even positive number");
		} else if (temperature % 2 == 1 && temperature < 0) {
			System.out.println("The temperature is an odd negative number");
		} else if (temperature % 2 == 0 && temperature < 0) {
			System.out.println("The temperature ia an even negative number");
		}
	}
}
