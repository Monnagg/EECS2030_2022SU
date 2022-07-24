import java.util.Date;

public class HourlyEmployee extends Employee {
	

	public HourlyEmployee(String name, Date dob, String employeeNo) {
		super(name, dob, employeeNo);
	}



	public String toString() {
		return super.toString() + "\nHourly rate: " + super.income;
	}
}
