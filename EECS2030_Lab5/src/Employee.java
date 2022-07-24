import java.util.Date;

abstract class  Employee extends Person {
	private String employeeNo;
	protected double income;

	public Employee(String name, Date dob, String employeeNo) {
		super(name, dob);
		String no = new String(employeeNo);
		this.employeeNo = no;
	}

	public double getSalary() {
		return income;
	}

	public void setSalary(double salary) {
		income = salary;
	}

	public String getEmployeeNo() {
		String no = new String(employeeNo);
		return no;
	}

	public String toString() {
		return "Employee\n" + super.toString() + "\nEmployee Number: " + employeeNo;

	}
}
