
public class Circle {
	
	private double radius;
	private String color;

	
	public Circle(double radius) {
		this.radius = radius;
		color = "Red";
	}


	public Circle() {
		radius = 1.0;
		color = "Red";
	}



	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}


	public double getRadius() {
		return radius;
	}


	public String getColor() {
		return color;
	}

	public double getArea(){
		return radius * radius * Math.PI;
	}
}
