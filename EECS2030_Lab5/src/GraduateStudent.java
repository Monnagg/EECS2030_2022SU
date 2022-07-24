import java.util.Date;

public class GraduateStudent extends Student{
	
	private String thesisSupervisor;

	public GraduateStudent(String name, Date dob, String studentNo) {
		super(name, dob, studentNo);

	}

	public String getThesisSupervisor() {
		return thesisSupervisor;
	}

	public void setThesisSupervisor(String name) {
		this.thesisSupervisor = name;
	}

	@Override
	public String toString() {
		return "Graduate " + super.toString() + "\nThesis Supervisor: " + thesisSupervisor;
	}

}
