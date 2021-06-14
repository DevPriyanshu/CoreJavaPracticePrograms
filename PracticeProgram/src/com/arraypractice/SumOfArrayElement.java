package com.arraypractice;

import java.util.Scanner;

public class SumOfArrayElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array: ");
		int s=sc.nextInt();
		int ar[]=new int[s];
		for(int i=0;i<s;i++)
		{
			System.out.print("Enter "+i+" index value: ");
			ar[i]=sc.nextInt();
		}
		SumOfArray.calSum(ar);
		sc.close();
	}
}
class SumOfArray
{
	public static void calSum(int[] ar)
	{
		int len=ar.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Sum of all array element is : "+sum);
	}
}


