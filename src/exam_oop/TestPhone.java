package exam_oop;

/*
Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 30] . 
 * */

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\n-------------------- Regular class is Instantiated below ------------------------");
		Iphone1 ip1 = new Iphone1();
		ip1.regularClassInfo();
		ip1.interfaceInfo();
		ip1.call();
		ip1.message();
		ip1.camera();
		ip1.battery();
		ip1.wakitaki();
		ip1.pager();
		System.out.println(ip1.family); // variable printed

		ip1.abstractClassInfo(); // Iphone1 help to instantiate AppleWatch abstract class
		ip1.appleWatchInfo();
		ip1.appleWatchSeries5();
		ip1.watch();
		ip1.digitalWatch();

		ip1.setPrice(750);
		ip1.setInfo("I bought the phone in 2000");
		ip1.setGrade('A');
		ip1.setMadeInUSA(false);

		System.out.println(ip1.getInfo() + ", The price was $: " + ip1.getPrice() + ", grade is " + ip1.getGrade()
				+ " and boolean value for made in USA is: " + ip1.isMadeInUSA());

		System.out.println("\n-------------------- Interface is Instantiated below ------------------------\n");
		Phone ph = new Iphone1();
		ph.interfaceInfo();
		ph.call();
		ph.message();
		ph.camera();
		ph.battery();
		ph.wakitaki();
		ph.pager();
		System.out.println("Name: " + Phone.Name + ", Company Name: " + Phone.CompanyName + ", Yearly salary: "
				+ Phone.yearlySalary + " and Monthly Salary: " + Phone.monthlySalary);
		Phone.wireless();

		System.out.println("\n-------------------- Abstract class is Instantiated below ------------------------\n");
		AppleWatch aw = new Iphone1(); // default constructor will print for this
		aw.abstractClassInfo();
		aw.appleWatchInfo();
		aw.appleWatchSeries5();
		aw.watch();
		aw.digitalWatch();

		AppleWatchSeries5 aws5 = new AppleWatchSeries5();
		aws5.appleWatchSeries5();

		Watch wa = new Iphone1();
		wa.watch();

		DigitalWatch dw = new Iphone1();
		dw.digitalWatch();

		Iphone2 ip2 = new Iphone2(); // until you instantiate Iphone2 class, super methods are not printing

	}

}
