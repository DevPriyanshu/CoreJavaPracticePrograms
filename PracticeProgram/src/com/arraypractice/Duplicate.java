package com.arraypractice;

import java.util.Scanner;

public class Duplicate {
	public static void main(String[] args) {
		FindDuplicate.disDupliacte();
	}
}
class FindDuplicate
{
	public static void disDupliacte()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int s=sc.nextInt();
		int ar[]=new int[s];
		System.out.println("Enter Array Element ");
		for(int i=0;i<s;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<s;i++)
		{
			for(int j=1;j<s;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
		}
		System.out.println("Duplicate array are "+count+" times");
	}
}