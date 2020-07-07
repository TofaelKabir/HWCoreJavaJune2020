package hw6Q2Abstraction04;

public class TestInstitute {

	public static void main(String[] args) {
		System.out.println("\n-------------------------------------------------------------\n");
		ColumbiaUniversity cu = new ColumbiaUniversity();
		cu.chemistry();
		cu.anatomyLab();
		cu.biochemistryLab();
		cu.caring();
		cu.hygiene();
		cu.maths();
		cu.computerLab();
		cu.aeronauticalInfo();
		cu.mechanicalLab();
		cu.computerLab();
		cu.anthropology();
		cu.classSize();
		cu.field();
		cu.teacher();
		cu.gymnasium();
		cu.commonRoom();
		cu.laboratory();
		cu.languageClub();
		cu.dorm();
		cu.cafeteria();
		cu.surgeryRoom();
		cu.emergencyRoom();
		cu.morgue();
		cu.VocationalInfo(); // 24 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");
		RockefellerUniversity ru = new RockefellerUniversity();
		ru.maths();
		ru.mechanicalLab();
		ru.computerLab();
		ru.anthropology();
		ru.aeronauticalInfo(); // 5 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");
		University un = new ColumbiaUniversity();
		un.classSize();
		un.field();
		un.teacher();
		un.gymnasium();
		University.library();
		un.commonRoom();
		un.laboratory();
		un.languageClub();
		un.dorm();
		un.cafeteria();
		un.emergencyRoom();
		un.surgeryRoom();
		un.morgue(); //13 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");
		Hospital hp = new ColumbiaUniversity();
		hp.cafeteria();
		hp.emergencyRoom();
		hp.surgeryRoom();
		hp.morgue();
		Hospital.pharmacy(); // 5 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");
		MedicalSchool ms = new ColumbiaUniversity();
		ms.anatomyLab();
		ms.biochemistryLab();
		ms.caring();
		ms.hygiene();
		ms.maths();
		ms.computerLab();
		ms.aeronauticalInfo();
		ms.mechanicalLab();
		ms.anthropology(); // 9 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");
		NursingSchool ns = new ColumbiaUniversity();
		ns.caring();
		ns.hygiene()  ;
		ns.maths();
		ns.computerLab();
		ns.aeronauticalInfo();
		ns.mechanicalLab();
		ns.anthropology(); // 7 methods is called
		
		System.out.println("\n-------------------------------------------------------------\n");

	}

}
