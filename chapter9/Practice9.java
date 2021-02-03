package chapter9;

public class Practice9 {
	public static void main(String[] args) {
		RegularPolygon test1 = new RegularPolygon();
		RegularPolygon test2 = new RegularPolygon(6, 4);
		RegularPolygon test3 = new RegularPolygon(10, 4, 5.6, 7.8);
		System.out.println("The perimeters of test1-test3 are: ");
		System.out.println(test1.getPerimeter(test1.getN(), test1.getSide()) + " "
				+ test2.getPerimeter(test2.getN(), test2.getSide()) + " "
				+ test3.getPerimeter(test3.getN(), test3.getSide()));
		System.out.println("The areas of test1-test3 are: ");
		System.out.println(test1.getArea(test1.getN(), test1.getSide()) + " "
				+ test2.getArea(test2.getN(), test2.getSide()) + " "
				+ test3.getArea(test3.getN(), test3.getSide()));
	}
}

class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	//Constructor1
	public RegularPolygon() {
	}
	//Constructor2
	public RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	
	//Constructor3
	public RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//private数据域访问器
	public int getN() {
	    return n;
	  }

	public double getSide() {
	    return side;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
	    return y;
	}
	
	//private数据域修改器
	public void setN(int number) {
	    n = number;
	}

	public void setSide(double newSide) {
		side = newSide;
	}

	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}
	
	//周长
	public double getPerimeter(int n, double side) {
		return n * side;
	}
	
	//面积
	public double getArea(int n, double side) {
		return n * side * side / 4 / Math.tan(Math.PI / n);
	}
}