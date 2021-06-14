package com.arraypractice;

import java.util.Scanner;

public class FindHigestNum {
	public static void main(String[] args) {
		Find.dispMax();
	}
}
class Find
{
	public static void dispMax()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size Of An Array: ");
		int s=sc.nextInt();
		
		int ar[]=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.print("Enter "+i+" position element: ");
			ar[i]=sc.nextInt();
		}
		sc.close();
		int max=ar[0];
		for(int i=0;i<s;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max+" is highest number ");
	}
}
