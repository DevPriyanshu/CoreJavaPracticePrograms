package doublearray;

import java.util.Scanner;

public class SumOfEachColAndRow {
	public static void main(String[] args) {
		int ar[][]=new int[3][2];
		System.out.println("Enter Element: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
					ar[i][j]=sc.nextInt();
			}
		}
		System.out.println(" ");
		System.out.println("Element of an array!");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
					System.out.print(ar[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println(" ");
		System.out.println("Sum Of All Row : ");
		
		for(int i=0;i<3;i++)
		{
			int sum=0;
			for(int j=0;j<2;j++)
			{
				sum=sum+ar[i][j];
			}
		System.out.println("Sum Of "+ (i+1) + " Row "+ sum);
		}
		System.out.println(" ");
		System.out.println("Sum Of All Column : ");
		
		for(int i=0;i<2;i++)
		{
			int sum=0;
			for(int j=0;j<3;j++)
			{
				sum=sum+ar[j][i];
			}
		System.out.println("Sum Of "+ (i+1) + " Column "+ sum);
		}
	}
}
