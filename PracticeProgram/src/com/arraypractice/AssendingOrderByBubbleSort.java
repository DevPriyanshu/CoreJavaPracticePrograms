package com.arraypractice;

import java.util.Scanner;

public class AssendingOrderByBubbleSort {
	public static void main(String[] args) {
		Bubble.dispBubble();
	}
}
class Bubble
{
	public static void dispBubble()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int s=sc.nextInt();
		int ar[]=new int[s];
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=0;j<=ar.length-2;j++)
			{
				if(ar[j]>ar[j+1])
				{
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		sc.close();
	}
}
