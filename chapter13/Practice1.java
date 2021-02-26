package chapter13;

import java.util.*;

public class Practice1 {

	public static void main(String[] args) {
	}

}

abstract class GeometricObject {
	
	protected String color;
	protected boolean filled;
		
	public abstract double getArea(double side1, double side2, double side3);
	public abstract double getPerimeter(double side1, double side2, double side3);
	
}

class Triangle extends GeometricObject {

	public double side1;
	public double side2;
	public double side3;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	
	@Override
	public double getArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt((s - side1) * (s - side2) * (s - side3) * s);
	}

	@Override
	public double getPerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
	
}





