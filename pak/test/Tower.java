package pak.test;

public class Tower 
{
	static int n = 5;
	public static void printTower(int n) 
	{
		int i, j;
		for (i=n-1; i>=0; i--)
		{
			for (j=-n+1; j<=n-1; j++)
			{
				if (i<=-Math.abs(j)+n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTower(n);
	}

}
