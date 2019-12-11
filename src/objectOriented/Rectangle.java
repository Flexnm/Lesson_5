package objectOriented;

public class Rectangle extends Shape { // Rectangle is a Shape
	// Attributes
	private int length;
	private int width;
	
	// Methods
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
