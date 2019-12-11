package person.ctors;

public class Manager extends Employee {

	private String department;

	public Manager(int id, String name, int age, double salary, String department) {
		super(id, name, age, salary);
		setDepartment(department);
	}
	
	public Manager() {
		this(-1, "Default", 18, 4000, "None");
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

}
