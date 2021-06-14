package com.arraypractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchNumBinaryAlgoritm {
	public static void main(String[] args) {
		Search1.searchNum();
	}
}
class Search1
{
	public static void searchNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int size=sc.nextInt();
		int[] a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Element at ["+i+"] index: ");
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Enter The Element which you want to find: ");
		int search=sc.nextInt();
		int li=0,hi=a.length-1;
		boolean found=false;
		int mi=li+hi/2;
		while(li<=hi)
		{
			if(a[mi]==search)
			{
				System.out.println("Congrats Element Found An "+mi+" index");
				found=true;
				break;
			}
			else if(search<a[mi])
			{
				hi=mi-1;
			}
			else
			{
				hi=mi
			}
		}
	}
}
