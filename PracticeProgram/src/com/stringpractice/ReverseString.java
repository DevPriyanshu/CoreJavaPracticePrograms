package com.stringpractice;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Reverse.dispRev();
	}
}
class Reverse
{
	public static void dispRev()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
	}
}
