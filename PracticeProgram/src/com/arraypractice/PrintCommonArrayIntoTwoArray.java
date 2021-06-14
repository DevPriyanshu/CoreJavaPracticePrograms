package com.arraypractice;

import java.util.Scanner;

public class PrintCommonArrayIntoTwoArray {
	public static void main(String[] args) {
		CommonElement.dispCommon();
	}
}
class CommonElement
{
	public static void dispCommon()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an 1 array: ");
		int s=sc.nextInt();
		int ar1[]=new int[s];
		System.out.println("Enter element: ");
		for(int i=0;i<ar1.length;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter Size of an 2 array: ");
		int s1=sc.nextInt();
		int ar2[]=new int[s1];
		System.out.println("Enter element: ");
		for(int i=0;i<ar2.length;i++)
		{
			ar2[i]=sc.nextInt();
		}
		System.out.println("Common element in array between 1st Array & 2nd Array ");
		for(int i=0;i<ar1.length;i++)
		{
			for(int j=0;j<ar2.length;j++)
			{
				if(ar1[i]==ar2[j])
				{
					System.out.println(ar1[i]);
				}
			}
		}
		sc.close();
	}
}