//WAP in java to print all the possible substrings from a given strings

package com.stringpractice;

import java.util.Scanner;

public class AllSubStringPrint {
	public static void main(String[] args) {
		PrintSub.dispAllPosibleSubString();
	}
}
class PrintSub
{
	public static void dispAllPosibleSubString()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			System.out.print(ch[i]+" ");
			for(int j=i+1;j<str.length();j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(ch[k]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
