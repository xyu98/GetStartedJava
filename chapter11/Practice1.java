package chapter11;

import java.util.Scanner;

public class Practice1 {
	public static void main(String[] args) {
		System.out.println ("Input the side length and if it is filled (true or false): ");
		Scanner input = new Scanner(System.in);
		Triangle test1 = new Triangle();
		test1.side1 = input.nextDouble();
		test1.side2 = input.nextDouble();
		test1.side3 = input.nextDouble();
		test1.filled = input.nextBoolean();
		test1.color = input.nextLine();
		System.out.println(test1.getArea(test1.side1, test1.side2, test1.side3));
		System.out.println(test1.getPerimeter(test1.side1, test1.side2, test1.side3));
	}
}

class GeometricObject {
	String color;
	boolean filled;
	
	public GeometricObject() {
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
}

class Triangle extends GeometricObject {
	double side1 = 1.0;
	double side2 = 1.0;
	double side3 = 1.0;
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt((s - side1) * (s - side2) * (s - side3) * s);
	}

	public double getPerimeter(double side1, double side2, double side3) {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
	}
}