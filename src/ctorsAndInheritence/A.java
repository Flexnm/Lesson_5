package ctorsAndInheritence;

public class A {
	// 1) Constructors are not inherited.
	// 2) If no constructor is provided, we get a default constructor.

	// public A() { This is how the default constructor looks like.
	// }
	// 3) But if a constructor is provided then the default constructor is no longer
	// available.
	// 4) The first line of ANY constructor is a call to another constructor.
	// 4a. Other constructor in the current class (this()).
	// 4b. Other constructor in a superclass (super()).
	// 4c. If no such call is written the default call is 'super()'.

	public A() {
		super();
		System.out.println("From A CTOR");
	}
	
	public static void main(String[] args) {
		C c = new C();
	}

}
