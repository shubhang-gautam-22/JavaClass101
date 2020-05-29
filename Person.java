public class Person {
	private String name;
	private int salary;
	private String emailAddress;
	private String department;
	private String dob;

	public Person(String name, int salary, String emailAddress, String department, String dob) {
		this.name = name;
		this.salary = salary;
		this.emailAddress = emailAddress;
		this.department = department;
		this.dob = dob;
	}

	public Person(String name, String emailAddress, String dob) {
		this.name = name;
		this.emailAddress = emailAddress;
		this.dob = dob;
	}

	public Person(String name, String emailAddress, String department, String dob) {
		this.name = name;
		this.emailAddress = emailAddress;
		this.department = department;
		this.dob = dob;
		this.salary = 4000;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary<0) {
			this.salary = 0;
		}else {
			this.salary = salary;
		}
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

}
