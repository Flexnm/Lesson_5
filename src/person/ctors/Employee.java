package person.ctors;

public class Employee extends Person {

	private double salary;
	
	public Employee(int id, String name, int age, double salary) {
		super(id, name, age);
		setSalary(salary);
	}
	
	public Employee() {
		this(-1, "Default", 18, 4000);
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

}
