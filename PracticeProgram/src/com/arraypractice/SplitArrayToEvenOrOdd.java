package com.arraypractice;

import java.util.Scanner;

public class SplitArrayToEvenOrOdd {
	public static void main(String[] args) {
		EvenOrOdd.splitArrayIntoOddOrEven();
	}
}
class EvenOrOdd
{
	public static void splitArrayIntoOddOrEven()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int s=sc.nextInt();
		int ar[] =new int[s];
		System.out.println("Enter Element to split into odd or even: ");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		int even=0,odd=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
		}
		int e[]=new int[even];
		int o[]=new int[odd];
		int Ecount=0,Ocount=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				Ecount++;
				for(int k=Ecount-1;k<e.length;k++)
				{
					e[k]=ar[i];
				}
			}
			else
			{
				Ocount++;
				for(int k=Ocount-1;k<o.length;k++)
				{
					o[i]=ar[i];
				}
			}
		}
		System.out.println("All Even Num ");
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
		System.out.println("All Odd Num ");
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		/*
		 * System.out.println("All Even Number are present in an array ! "); for(int
		 * i=0;i<ar.length;i++) { if(ar[i]%2==0) { System.out.println(ar[i]); } }
		 * System.out.println("All Odd Number are present in an array !"); for(int
		 * i=0;i<ar.length;i++) { if(ar[i]%2!=0) { System.out.println(ar[i]); } }
		 */
		sc.close();
	}
}

