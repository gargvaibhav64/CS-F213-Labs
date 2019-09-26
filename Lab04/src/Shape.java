// Define superclass Shape
abstract public class Shape {
	// Private member variable
	private String color;
	// Constructor
	public Shape (String color) {
		this.color = color;
	}
	@Override
 	public String toString() {
	 	return "Shape of color=\"" + color + "\"";
 	}
	// All shapes must has a method called getArea()
	abstract public double getArea() ;
}