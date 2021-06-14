//WAP to take 2d array from user and do sum of dig util digit will not comes a single digit

package com.arraypractice;

import java.util.Scanner;

public class SingleDig {
	public static void main(String[] args) {
		
	}
}
class SumofEachDig
{
	public static void findSumOgDig()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row Of Array : ");
		int row=sc.nextInt();
		System.out.println("Enter Col Of Array : ");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter Element at ["+i+"] row and ["+j+"] col: ");
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
	}
}
