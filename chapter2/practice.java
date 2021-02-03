package chapter2;

import java.util.Scanner;

public class practice {
	
	public static void sumOfFigures(int input) {
		int baiwei = input / 100;
		int shiwei = (input - baiwei * 100) / 10;
		int gewei = input - baiwei * 100 - shiwei * 10;
		System.out.println(baiwei + shiwei + gewei);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		
		int input_num = input.nextInt();
		sumOfFigures(input_num);
	}
	
}
