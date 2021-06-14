package com.arraypractice;

import java.util.Scanner;

public class RotateArrayInKTimes {
	public static void main(String[] args) {
		KTimesRotation.kTimesArrayRotatation();
	}
}
class KTimesRotation
{
	public static void kTimesArrayRotatation()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Size Of An Array: ");
		int s=sc.nextInt();
		int ar[]=new int[s+1];
		System.out.println("Enter Element In An Array: ");
		for(int i=0;i<s;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("How many rotation you want please enter ");
		int k=sc.nextInt();
		
		for(int x=1;x<=k;x++)
		{
			for(int i=s-1;i>=0;i--)
			{
				ar[i+1]=ar[i];
			}
			ar[0]=ar[s];

		}
		for(int i=0;i<s;i++)
		{
			System.out.println(ar[i]);
		}
		sc.close();
	}
}

