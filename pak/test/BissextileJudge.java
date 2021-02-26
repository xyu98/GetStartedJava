package pak.test;

import java.util.Scanner;

public class BissextileJudge {
	//设置年份
	//static int year = 2020; //静态变量可以通过类名访问，实例变量只能通过对象来访问

	public static boolean isBissextile(int year) {
		if ((year%4==0)&&(year%100!=0)||(year%400==0))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		//也可以用输入的方式读取年份
		System.out.println("Enter a year:");
		Scanner input = new Scanner(System.in); //创建一个scanner对象input.多个输入只需要创建一次
		int year = input.nextInt(); //调用对象自身的方法nextInt来读取一个数值并赋给year
		//int year2 = input.nextInt();
		//int year3 = input.nextInt();
		
		if (isBissextile(year))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
