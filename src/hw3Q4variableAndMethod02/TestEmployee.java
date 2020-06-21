package hw3Q4variableAndMethod02;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.Name = "Tofael";
		emp1.age = 44;
		emp1.sex = 'M';
		emp1.usaCitizen = false;
		emp1.empInfo();
		
		Employee emp2 = new Employee();
		emp2.Name = "Kabir";
		emp2.age = 54;
		emp2.sex = 'M';
		emp2.usaCitizen = true;
		emp2.empInfo();
	}

}

