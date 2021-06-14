//Find Max Sum of Row in an 2D array

package com.arraypractice;

import java.util.Scanner;

public class FindMaxSumIn2D {
	public static void main(String[] args) {
		FindMAx.dispMax();
	}
}
class FindMAx
{
	public static void dispMax()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of row: ");
		int r=sc.nextInt();
		System.out.println("Enter size of col: ");
		int c=sc.nextInt();
		int ar[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter value: ");
			    ar[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		int arsum[]=new int[r];
	
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arsum[i]=ar[i][j]+arsum[i];
			}
		}
		int max=0,index=0;
		for(int j=0;j<c;j++)
		{
			for(int i=j+1;i<arsum.length;j++)
			{
				if(arsum[i]>max)
				{
					max=arsum[i];
					index=i;
				}
			}
		}
		System.out.println("Max Row Of an array :");
		for(int i=0;i<c;i++)
		{
			System.out.println(ar[index][i]+" ");
		}
		sc.close();
	}
}

