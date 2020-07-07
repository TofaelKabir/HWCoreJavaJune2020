package hw6Q2Abstraction04;

//extends and implements keyword is used in Java, but in interface implements keyword is not used
public interface Hospital {
	public void cafeteria();
	public void emergencyRoom();
	public void surgeryRoom();
	
	public default void morgue() {
		System.out.println("From default method of Hospital");
	}
	
	public static void pharmacy() {
		System.out.println("From static method of Hospital");
	}
	
}
