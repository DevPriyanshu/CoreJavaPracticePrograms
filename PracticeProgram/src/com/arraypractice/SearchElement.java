//WAP in java to search the given element is present in a array also print the index of the element

package com.arraypractice;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		Search.searchElement();
	}
}
class Search
{
	public static void searchElement()
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("Enter Element to search in an Exist Array: ");
		int search=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Congrats Element is find at "+i+" index !");
			}
			else
			{
				System.out.println("Sorry Searching Element Is Not Found !");
			}
		}
		sc.close();
	}
}
