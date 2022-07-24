import java.util.Date;

public class Person {

	private String name;
	private Date dob;

	public Person(String name, Date dob) {
		String str = new String(name);
		Date d = new Date(dob.getTime());

		this.name = str;
		this.dob = d;
	}

	public String getName() {
		String str = new String(name);
		return str;
	}

	public Date getDob() {
		Date d = new Date(dob.getTime());
		return d;
	}

	@Override
	public String toString() {
		return "Name: " + name + "\nDOB: " + dob;
	}

}

