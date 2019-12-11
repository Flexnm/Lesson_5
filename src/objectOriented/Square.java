package objectOriented;

public class Square extends Rectangle { // Square is a Rectangle (is a Shape)
	
	private String str;
	public String isSquare() {
		if (getLength() == getWidth()) {
			str = "Yes";
			return str;
		} else {
			str = "No";
			return str;
		}

	}

}
