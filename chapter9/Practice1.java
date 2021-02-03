package chapter9;

public class Practice1 {

	/*
	 * 写到这里不行，因为主方法是静态方法，不可以直接调用非静态方法和成员
	Rectangle testRec1 = new Rectangle(4, 40);
	Rectangle testRec2 = new Rectangle(3.5, 35.9);
	*/
	
	public static void main(String[] args) {
		
		Rectangle testRec1 = new Rectangle(4, 40);
		Rectangle testRec2 = new Rectangle(3.5, 35.9);
		System.out.println(testRec1.width + " " + testRec1.height + 
				" " + testRec2.width + " " + testRec2.height);
		System.out.println(testRec1.getArea(testRec1.width, testRec1.height));
		System.out.println(testRec2.getArea(testRec2.width, testRec2.height));
		System.out.println(testRec1.getPerimeter(testRec1.width, testRec1.height));
		System.out.println(testRec2.getPerimeter(testRec2.width, testRec2.height));
		
	}

}

class Rectangle {
	
	double width = 1;
	double height = 1;
	
	// Constructor
	public Rectangle() {
	}
	
	// Constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getArea(double width, double height) {
		return (width * height);
	}
	
	public double getPerimeter(double width, double height) {
		return (2 * (width + height));
	}
	
}