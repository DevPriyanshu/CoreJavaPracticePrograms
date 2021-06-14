
//wap in java to print multiple stars on n lines
//m(number of stars) and n(number of lines) must be user inputs

import java.util.Scanner;

public class PatternByUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Stars: ");
		int m=sc.nextInt();
		System.out.println("Enter Number Of Lines: ");
		int n=sc.nextInt();
		User.printStar(m, n);
		sc.close();
	}
}
class User
{
	public static void printStar(int m,int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
