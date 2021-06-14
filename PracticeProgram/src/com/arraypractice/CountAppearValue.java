//WAP a java program to check how many times a given element has appeard in an array
package com.arraypractice;

import java.util.Scanner;

public class CountAppearValue {
	public static void main(String[] args) {
		CountGivenValue.countGivenValue();
	}
}
class CountGivenValue
{
	public static void countGivenValue()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size of an an array :");
		int s=sc.nextInt();
		int ar[]=new int[s];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter Array Element at position: "+i);
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter value those you want to search in array element: ");
		int se=sc.nextInt();
		int flag=0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==se)
			{
				flag++;
			}
		}
		System.out.println(flag+ "Times Searching value is present in an array ");
		sc.close();
	}
}
