//write a Java program to accept 2 arrays from user and print the array whose average is greater

package com.arraypractice;

import java.util.Scanner;

public class FindAvgIntoTwoArray {
	public static void main(String[] args) {
		FindAvg.dispAvgArry();
	}
}
class FindAvg
{
	public static void dispAvgArry()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int size1=sc.nextInt();
		
		int ar1[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter Size Of An 2nd Array: ");
		int size2=sc.nextInt();
		
		int ar2[]=new int[size2];
		for(int i=0;i<size2;i++)
		{
			ar2[i]=sc.nextInt();
		}
		
		int ar1sum=0;
		for(int i=0;i<size1;i++)
		{
			ar1sum=ar1sum+ar1[i];
		}
		
		int ar2sum=0;
		for(int i=0;i<size2;i++)
		{
			ar2sum=ar2sum+ar2[i];
		}
		float avgar1=ar1sum/size1;
		float avgar2=ar2sum/size2;
		System.out.println("Average Array is !");
		if(avgar1>avgar2)
		{
			for(int i=0;i<size1;i++)
			{
				System.out.print(ar1[i]+" ");
			}
		}
		else
		{
			for(int i=0;i<size2;i++)
			{
				System.out.print(ar2[i]+" ");
			}
		}
		sc.close();
	}
}

