package com.stringpractice;
import java.util.Scanner;

public class StringPalindromOrNot {
	public static void main(String[] args) {
		CheckPal.checkPalindrom();
	}
}
class CheckPal
{
	public static void checkPalindrom()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value to check palindrom or not: ");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String r="";
		for(int i=ch.length-1;i>=0;i--)
		{
			r=r+ch[i];
		}
		if(s.equals(r))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
