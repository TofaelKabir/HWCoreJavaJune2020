package exam_oop;

/*
08) Now, Think about Iphone6. It also has 5 methods with the same name as materials(). For example -- They are parameterized method (int ramPrice, int cameraPrice), another one (int ramPrice, int cameraPrice, String ProcessorPrice), etc. Can you use the void, parameterized, final, or static method here as the same method name? if yes, create them and take more int variable of your own. What kind of concept you can use? [points: 30]. Instantiate the class in TestPhone and initialize those methods. [points: 30]. Now think about a regular class Name ConfiguredIphone6 which extends Iphone6. Override those methods and change the logic at your own to show the changes. [points: 20]. Show the output in TestPhone. [points: 20]. Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, and single inheritance. [points: 20].
 * */

public class ConfiguedIphone6 extends Iphone6 {

	@Override
	public void materials() {
		System.out.println("Materials method from ConfiguedIphone6 class");
	}

	@Override
	public int materials(int ramPrice, int cameraPrice) {
		int totalPrice = ramPrice + cameraPrice + 56;
		System.out.println("Some of the Iphone6 material price: " + totalPrice);
		return totalPrice;
	}

	// Static method can't be override
//	@Override
//	public static int materials(int ramPrice, int cameraPrice, String ProcessorPrice) {
//		int totalPrice = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + -89;
//		System.out.println("Some of the Iphone6 material price: " + totalPrice);
//		return totalPrice;
//	}

	// Final method can't be override
//	@Override
//	public final int materials(int ramPrice, int cameraPrice, String ProcessorPrice, int bill) {
//		int totalPrice = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + bill + 45;
//		System.out.println("Some of the Iphone6 material price: " + totalPrice);
//		return totalPrice;
//	}

	@Override
	public void materials(int ramPrice, int cameraPrice, String ProcessorPrice, int bill, int chargerPrice) {
		int totalPrice = ramPrice + cameraPrice + Integer.parseInt(ProcessorPrice) + bill + chargerPrice + 23;
		System.out.println("Some of the Iphone6 material price: " + totalPrice);
	}

}
