//WAP in java to check if array is symmetric or not?  
//Note:- symmetric when it's sum of diagonal are equal.

package com.arraypractice;

import java.util.Scanner;

public class CheckSymmetric {
	public static void main(String[] args) {
		Symmetric.checkSymmetric();
	}
}
class Symmetric
{
	public static void checkSymmetric()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Of An Array: ");
		int row=sc.nextInt();
		System.out.println("Enter Col Of An Array: ");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter Element in ["+i+"] row and "+"["+j+"] col :");
				ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int lsum=0,rsum=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j)
				{
					lsum=lsum+ar[i][j];
				}
				if((i+j)==(row-1))
				{
					rsum=rsum+ar[i][j];
				}
			}
		}
		
		if(lsum==rsum)
		{
			System.out.println("Symmetric");
		}
		else
		{
			System.out.println("Not Symmetric");
		}
		sc.close();
	}
}