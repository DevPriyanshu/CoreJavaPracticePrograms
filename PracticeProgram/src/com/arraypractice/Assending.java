package com.arraypractice;

import java.util.Scanner;

public class Assending {
	public static void main(String[] args) {
		ArrangeAssending.dispAssn();
	}
} 
class ArrangeAssending
{
	public static void dispAssn()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int s=sc.nextInt();
		int ar[] =new int[s];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter Array value at "+i+" position: ");
			ar[i]=sc.nextInt();
		}
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
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
