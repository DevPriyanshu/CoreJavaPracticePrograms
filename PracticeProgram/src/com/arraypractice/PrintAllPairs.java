package com.arraypractice;

import java.util.Scanner;

public class PrintAllPairs {
	public static void main(String[] args) {
		Pair.dispPair();
	}
}
class Pair
{
	public static void dispPair()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Element At "+i+" index: ");
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter Number To Find All Element Who's Pairs Of its Num: ");
		int p=sc.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]+ar[j]==p)
				{
					System.out.println(ar[i]+ " , "+ar[j] );
				}
			}
		}
		sc.close();
	}
}
