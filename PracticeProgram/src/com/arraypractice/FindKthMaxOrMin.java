package com.arraypractice;

import java.util.Scanner;

public class FindKthMaxOrMin {
	public static void main(String[] args) {
		FindMaxOrMin.findMaxMin();
	}
}
class FindMaxOrMin
{
	public static void findMaxMin()
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
		System.out.println("Enter Number To Find nTh Max & nTh Min: ");
		int f=sc.nextInt();
		
		int temp=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<n;i++)
		{
			if(ar[i]==ar[f])
			{
				System.out.println(ar[i]+" is a " +f +" Maximum Element in an array !");
			}
		}
		for(int i=n-1;i>=0;i--)
		{
			if(ar[i]==ar[f-1])
			{
				System.out.println(ar[i]+" is a " +f +" Minimum Element in an array !");
			}
		}
	}
}

