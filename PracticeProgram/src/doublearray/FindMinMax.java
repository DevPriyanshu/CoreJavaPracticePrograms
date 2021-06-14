package doublearray;

import java.util.Scanner;

public class FindMinMax 
{
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
		System.out.println("Array ! ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(ar[i][j] +"\t");
			}
			System.out.println(" ");
		}
		
		int min=ar[0][0];
		int max=ar[0][0];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				if(ar[i][j]<min)
				{
					min=ar[i][j];
				}
				if(ar[i][j]>max)
				{
					max=ar[i][j];
				}
			}
		}
		System.out.println("Smallest Number is "+min);
		System.out.println("Smallest Number is "+max);
	}
}
