package assignment;

public class Q3b_Square extends Q3_shape {
	
	private Q3_Point topLeft;
	private double width;
	
	public Q3b_Square(double a, double b, double radius) {
		super("Cirle");
		this.topLeft = new Q3_Point(a, b);
		this.width = radius;
	}	
	public Q3_Point getCenter() {
		return topLeft;
	}
	
	public void setCenter(Q3_Point center) {
		this.topLeft = center;
	}
	public double getRadius() {
		return width;
	}
	public void setRadius(double radius) {
		this.width = radius;
	}
	public double getArea() {
		return this.width*this.width;
	}
	public String toString() {
		return "TopLeft = " + topLeft.toString() + "Width = "+ this.width;
		
	}
	
	

}