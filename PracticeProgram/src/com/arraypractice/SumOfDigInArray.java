//WAP in java to print all such numbers from a 2D array whose sum of digits is 
//equal to the sum of provided by the user

package com.arraypractice;

import java.util.Scanner;

public class SumOfDigInArray {
	public static void main(String[] args) {
		SumOfElement.printSumOfDig();
	}
}
class SumOfElement
{
	public static void printSumOfDig()
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
		System.out.println("Array Element! ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Enter Number which you want to fetch only that type of element whose "
							+"sum is equal to that num: ");
		int fe=sc.nextInt();
		int sum=0,dig;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				while(ar[i][j]>0)
				{
					dig=ar[i][j]%10;
					sum=sum+dig;
					ar[i][j]=ar[i][j]/10;
				}
				if(sum==fe)
				{
					System.out.println(ar[i][j]+" ");
				}
				sum=0;
			}
		}
		sc.close();
	}
}

		
