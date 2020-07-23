package exam_oop;

/*
03) Assume AppleWatch is an abstract class which has 2 method: One is abstractClassInfo [which is a non-abstract method, print out all the features of an abstract class compared with Interface, regular class]. what type of method would be the other one - name appleWatchInfo? Can you create a constructor inside Abstract Class? Create two interface names Watch, DigitalWatch. And a regular class name AppleWatchSeries5. Can you make a relationship with AppleWatch, Watch, DigitalWatch, and AppleWatchSeries5? [points: 30] . 
 * */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	public AppleWatch() {
		System.out.println("Deafult constrcutor from Abstract Class");
	}

	public void abstractClassInfo() {
		System.out.println(
				"An Abstract class must contain a abstract method and a keyword abstract in class declaration. It can extends a regular class or an abstract class and implements more than one Interface");
	}

	public abstract void appleWatchInfo();

}
