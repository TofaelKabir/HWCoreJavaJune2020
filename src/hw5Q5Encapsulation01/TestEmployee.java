package hw5Q5Encapsulation01;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Tofael");
		emp1.setAge(44);
		emp1.setSex('M');
		emp1.setUsCitizen(false);
		
		System.out.println("Employee name: "+emp1.getName()+", Age: "+emp1.getAge()+
				", Sex: "+emp1.getSex()+", USA Citizen status: "+emp1.isUsCitizen());
		
		Employee emp2 = new Employee();
		emp2.setName("Ruslan");
		emp2.setAge(30);
		emp2.setSex('M');
		emp2.setUsCitizen(false);
		System.out.println("Employee name: "+emp2.getName()+", Age: "+emp2.getAge()+
				", Sex: "+emp2.getSex()+", USA Citizen status: "+emp2.isUsCitizen());
	}

}
