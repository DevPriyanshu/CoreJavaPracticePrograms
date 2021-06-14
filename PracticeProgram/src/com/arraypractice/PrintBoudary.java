package com.arraypractice;

import java.util.Scanner;

public class PrintBoudary {
	public static void main(String[] args) {
		Bound.dispArrayBounday();
	}
}
class Bound
{
	public static void dispArrayBounday()
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
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==0 || j==0 || i==row-1 || j==col-1)
				{
					System.out.print(ar[i][j]+" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
