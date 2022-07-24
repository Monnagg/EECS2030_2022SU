import java.util.Date;

public class Student extends Person {
	
	private String studentNo;

	public Student(String name, Date dob, String studentNo) {
		super(name, dob);
		String no = new String(studentNo);
		this.studentNo = no;
	}

	public String getStudentNo() {
		String no = new String(studentNo);
		return no;
	}

	@Override
	public String toString() {
		return "Student\n" + super.toString() + "\nStudent Number: " + studentNo;
	}
	
}
