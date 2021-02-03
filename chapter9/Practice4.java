package chapter9;

import java.util.Random;

public class Practice4 {
	public static void main(String[] args) {
		int seed = 1000;
		int i = 0, r = 0;
		Random randNum = new Random(seed);
		for (i = 0; i < 50; i++) {
			r = randNum.nextInt(100);
			System.out.println(r);
		}
	}
}
