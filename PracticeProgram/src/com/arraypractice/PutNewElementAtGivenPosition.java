package com.arraypractice;

import java.util.Scanner;

public class PutNewElementAtGivenPosition {
	public static void main(String[] args) {
		PutElement.addElementAtGivenPosition();
	}
}
class PutElement
{
	public static void addElementAtGivenPosition()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Arry: ");
		int size=sc.nextInt();
		int ar[]=new int[size+1];
		for(int i=0;i<size;i++)
		{
			System.out.print("Enter "+i+" index value:");
			ar[i]=sc.nextInt();
		}
		System.out.println("Succesfully Stored Element In An Arry !");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.print("Please Enter New Element which you want to store in an existing array:");
		int element=sc.nextInt();
		System.out.println("Please Enter Position where you want to store this element");
		int pos=sc.nextInt();
		for(int i=size;i>pos;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[pos]=element;
		System.out.println("Congrats, Element Succesfully Inserted !");
		System.out.println("array after adustment");
		for(int i=0;i<size+1;i++)
		{
			System.out.println(ar[i]);
		}
		sc.close();
	}
}