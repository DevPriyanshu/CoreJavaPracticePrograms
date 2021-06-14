package com.stringpractice;

import java.util.Scanner;

public class LargestSubStringWithoutDublicate {
	public static void main(String[] args) {
		NotDuplicateSubstring.dispLargest();
	}
}
class NotDuplicateSubstring
{
	public static void dispLargest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			System.out.print(ch[i]+" ");
			for(int j=i+1;j<s.length();j++)
			{
				for(int k=0;k<j+1;k++)
				{
					System.out.print(ch[k]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
