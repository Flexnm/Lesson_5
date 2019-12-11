package person.ctors;

public class TestPerson {
	public static void main(String[] args) {

		Person p1 = new Person(1, "Dan", 25);
		Person p2 = new Person(2, "Ron");
		Person p3 = new Person(3);
		Manager p4 = new Manager();

		System.out.println(p1.getId() + " " + p1.getAge() + " " + p1.getName());
		System.out.println(p2.getId() + " " + p2.getAge() + " " + p2.getName());
		System.out.println(p3.getId() + " " + p3.getAge() + " " + p3.getName());
		System.out.println(p4.getId() + " " + p4.getAge() + " " + p4.getName() + " " + p4.getDepartment());

	}

}
