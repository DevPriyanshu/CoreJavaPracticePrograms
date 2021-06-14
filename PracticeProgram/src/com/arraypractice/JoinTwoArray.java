package com.arraypractice;

import java.util.Scanner;

public class JoinTwoArray {
	public static void main(String[] args) {
		Join.joinArray();
	}
}
class Join
{
	public static void joinArray()
	{
		Scanner sc=new Scanner(System.in);
		
		//1st array input
		System.out.print("Enter 1 array size: ");
		int s1=sc.nextInt();
		int ar1[]=new int[s1];
		for(int i=0;i<s1;i++)
		{
			System.out.println("Enter "+i+" element in an 1st array !");
			ar1[i]=sc.nextInt();
		}
		
		//2nd array input
		System.out.print("Enter 2 array size: ");
		int s2=sc.nextInt();
		int ar2[]=new int[s2];
		for(int i=0;i<s2;i++)
		{
			System.out.println("Enter "+i+" element in an 1st array !");
			ar2[i]=sc.nextInt();
		}
		sc.close();
		
		//logic of join array
		int ar3[]=new int[s1+s2];
		for(int i=0;i<s1;i++)
		{
			ar3[i]=ar1[i];
		}
		for(int i=s1;i<s1+s2;i++)
		{
			ar3[i]=ar2[i-s1];
		}
		
		//printing 1st array
		System.out.println("1st Array !");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		
		//printing 2nd array
		System.out.println("2nd Array !");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		System.out.println();
		
		//printing joind array
		System.out.println("Joined Array !");
		for(int i=0;i<ar3.length;i++)
		{
			System.out.print(ar3[i]+" ");
		}
	}
}

