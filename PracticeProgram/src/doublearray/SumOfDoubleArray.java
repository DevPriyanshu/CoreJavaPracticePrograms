package doublearray;

import java.util.Scanner;

public class SumOfDoubleArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row:");
		int row=sc.nextInt();
		System.out.println("Enter Size of Column:");
		int column=sc.nextInt();
		
		int ar[][]=new int[row][column];
		
		System.out.println("Enter num: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("2d Array!");
		int sum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(ar[i][j]+"\t");
				sum=sum+ar[i][j];
			}
			System.out.println(" ");
		}
		System.out.println("Sum of all element in an array "+ sum);
	}
}
