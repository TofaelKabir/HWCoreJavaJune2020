package hw6Q2Abstraction04;

//extends and implements keyword is used in Java, but in interface implements keyword is not used
public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("From default method of College");
	}
	
	public static void studyRoom() {
		System.out.println("From static method of College");
	}

}
