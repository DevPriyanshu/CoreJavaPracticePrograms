//WAP in java to print the elements of an array in spiral order

package com.arraypractice;

import java.util.Scanner;

public class SpiralArray {
	public static void main(String[] args) {
		
	}
}
class Spiral
{
	public static void dispSpiralWay()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row : ");
		int row=sc.nextInt();
		System.out.println("Enter Size of column: ");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
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
		int r=0,c=0;
		while(r<row && c<col)
		{
			for(int i=c;i<col;i++)
			{
				System.out.println(ar[row][i]);
			}
			r++;
			for(int i=r;i<row;i++)
			{
				System.out.println(ar[i][c-1]);
			}
			col--;
			
		}
	}
}
