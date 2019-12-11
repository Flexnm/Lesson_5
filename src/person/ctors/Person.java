package person.ctors;

public class Person {
	// Attributes
	private int id;
	private String name;
	private int age;

	// CTORs

	public Person(int id, String name, int age) {
		super();
		setId(id);
		setName(name);
		setAge(age);
	}

	public Person(int id, String name) {
		this(id, name, 18); // Default age is 18.
	}

	public Person(int id) {
		this(id, "Default"); // Default name is "Default".
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
}
