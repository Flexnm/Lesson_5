package objectOriented;

public class ShapeTest {
	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setColor("Blue");
		r.setLength(10);
		r.setWidth(10);
		
		

		System.out.println(r.getColor() + " " + r.getLength() + " " + r.getWidth());
		
	}

}
