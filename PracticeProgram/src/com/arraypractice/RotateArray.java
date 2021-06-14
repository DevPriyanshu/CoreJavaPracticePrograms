package com.arraypractice;

import java.util.Scanner;

public class RotateArray {
	public static void main(String[] args) {
		RotateArrayEle.rotateArrayElement();
	}
}
class RotateArrayEle
{
	public static void rotateArrayElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		int s=sc.nextInt();
		int ar[]=new int[s+1];
		for(int i=0;i<s;i++)
		{
			System.out.println("Enter "+i+" element in an array: ");
			ar[i]=sc.nextInt();
		}
		for(int i=s-1;i>=0;i--)
		{
			ar[i+1]=ar[i];
		}
		ar[0]=ar[s];
		System.out.println("Shifting element: ");
		for(int i=0;i<s;i++)
		{
			System.out.println(ar[i]);
		}
		sc.close();
	}
}
