package pak.test;

public class Converter {
	static char grade;
	
	public static void toScore(double score){
		if (score>=85)
			grade = 'A';
		else if (score>=70)
			grade = 'B';
		else if (score>=60)
			grade = 'C';
		else
			grade = 'D';
	}
	
	public static void printGrade(char grade) {
		/*
		switch (grade) {
		case 'A': System.out.println("A"); break;
		case 'B': System.out.println("B"); break;
		case 'C': System.out.println("C"); break;
		case 'D': System.out.println("D"); break;
		}
		*/
		System.out.println(grade);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		toScore(score);
		printGrade(grade);
	}

}
