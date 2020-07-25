package exam_oop;

/*
Think about a class name TestPhone. Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. Go to next step after finishing till this. [points: 30] . 
 * */

public class TestPhone {

	public static void main(String[] args) {
		System.out.println("\n-------------------- Regular class is Instantiated below ------------------------\n");
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

		System.out.println("\n------------------ Java encapsulation is initialized here  ---------------------\n");
		ip1.setPrice(750);
		ip1.setInfo("I bought this phone in 2000");
		ip1.setUser('M');
		ip1.setMadeInUSA(false);

		System.out.println(ip1.getInfo() + ", The price was : " + ip1.getPrice() + "$, user's sex: " + ip1.getUser()
				+ " and boolean value for made in USA is: " + ip1.isMadeInUSA());

		System.out.println("\n------------------ Java Inheritance is initialized here  ---------------------\n");
		Iphone6 ip6 = new Iphone6();
		ip6.photos();
		ip6.dropbox();
		ip6.youtube();
		ip6.mail();
		ip6.compass();
		ip6.regularClassInfo();
		ip6.appleWatchInfo();
		ip6.digitalWatch();
		ip6.watch();
		ip6.camera();
		ip6.message();
		ip6.call();
		ip6.interfaceInfo();
		ip6.wakitaki();
		ip6.pager();
		ip6.regularClassInfo();
		ip6.setPrice(950);
		ip6.setInfo("I bought this phone in 2016");
		ip6.setUser('M');
		ip6.setMadeInUSA(false);
		System.out.println(ip6.getInfo() + ", The price was : " + ip6.getPrice() + "$, user's sex: " + ip6.getUser()
				+ " and boolean value for made in USA is: " + ip6.isMadeInUSA());

		System.out.println("\n-------------- Use of super in Java Inheritance  ------------------\n");
		Iphone2 ip21 = new Iphone2();
		System.out.println("\n");
		Iphone2 ip22 = new Iphone2('M');
		System.out.println("\n");
		ip21.mail();
		System.out.println("\n");
		ip21.iPhone2Info();
		System.out.println("\n");
		ip21.iPhone2Info('M');

		System.out.println("\n------------------ Java polymorphism is initialized here  ---------------------\n");
		ip6.materials();
		ip6.materials(200, 100);
		Iphone6.materials(200, 100, "60");
		ip6.materials(200, 100, "60", 120);
		ip6.materials(200, 100, "60", 120, 20);
		System.out.println("\n");

		ConfiguedIphone6 cip6 = new ConfiguedIphone6();
		System.out.println("\n");
		cip6.materials();
		cip6.materials(200, 100);
		cip6.materials(200, 100, "60", 120, 20);

		/*
		 * hierarchical inheritance: Iphone2 extends Iphone1 , Iphone3 extends Iphone1.
		 * multilevel inheritance: Iphone6 extends Iphone5 , Iphone5 extends Iphone4,
		 * Iphone4 extends Iphone2 , Iphone2 extends Iphone1. single inheritance:
		 * Iphone6 extends Iphone5, Iphone2 extends Iphone1 , Iphone4 extends Iphone2.
		 */

	}

}
