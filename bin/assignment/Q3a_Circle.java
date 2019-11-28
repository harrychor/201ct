package assignment;

import java.util.Scanner;

import assignment.Q3_Point;
import assignment.Q3_shape;

public class Q3a_Circle extends Q3_shape {
	
	private Q3_Point center;
	private double radius;
	
	public Q3a_Circle(double a, double b, double radius) {
		super("Cirle");
		this.center = new Q3_Point(a, b);
		this.radius = radius;
	}	
	public Q3_Point getCenter() {
		return center;
	}
	
	public void setCenter(Q3_Point center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	public String toString() {
		return "Center = " + center.toString() + "Radius = "+ this.radius;
		
	}
	
	

}
