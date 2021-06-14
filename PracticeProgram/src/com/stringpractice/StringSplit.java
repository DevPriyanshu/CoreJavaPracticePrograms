package com.stringpractice;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		Split.splitString();
	}
}
class Split
{
	public static void splitString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		String n=sc.nextLine();
		char[] ar=n.toCharArray();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
}