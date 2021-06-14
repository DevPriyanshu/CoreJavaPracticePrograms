//write a java to print the sum of corresponding elements of two arrays

package com.arraypractice;

import java.util.Scanner;

public class SumOfCorrespondingElement {
	public static void main(String[] args) {
		SumOfCorrespondingEElement.dispSum();
	}
}
class SumOfCorrespondingEElement
{
	public static void dispSum()
	{
		Scanner sc=new Scanner(System.in);
		
		//first array
		System.out.print("Enter Size Of An first Array: ");
		int a1=sc.nextInt();
		int ar[]=new int[a1];
		for(int i=0;i<a1;i++)
		{
			System.out.println("Enter first array position element at: " +i);
			ar[i]=sc.nextInt();
		}
		
		//2nd array
		System.out.print("Enter Size Of An second Array: ");
		int a2=sc.nextInt();
		
		int ar1[]=new int[a2];
		for(int i=0;i<a2;i++)
		{
			System.out.println("Enter second array position element at: " +i);
			ar1[i]=sc.nextInt();
		}
		sc.close();
		
		//sum of corresponding
		int s3;
		if(a1>a2)
		{
			s3=a1;
		}
		else
		{
			s3=a2;
		}
		int ar3[]=new int[s3];
		
		int sum=0;
		for(int i=0;i<s3;i++)
		{
			for(int j=0;j<a1;j++)
			{
				for(int k=0;k<a2;k++)
				{
					sum=ar[j]+ar1[k];
					ar3[i]=sum;
				}
			}
		}
		System.out.println("Sum of 1st Array and 2nd Array");
		for(int i=0;i<s3;i++)
		{
			System.out.println(ar3[i]);
		}
	}
}

