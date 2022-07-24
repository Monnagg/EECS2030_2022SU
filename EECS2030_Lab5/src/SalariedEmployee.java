import java.util.Date;

public class SalariedEmployee extends Employee {
	//double salary;

	public SalariedEmployee(String name, Date dob, String employeeNo) {
		super(name, dob, employeeNo);
	}



	public String toString() {
		return super.toString() + "\nSalary: " + super.income;
	}

}

