package com.stringpractice;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Rev.revSentence();
	}
}
class Rev
{
	public static void revSentence()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence to reverse : ");
		String sen=sc.nextLine();
		char c[]=sen.toCharArray();
		char ch=' ';
		int space=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==ch)
			{
				space++;
			}
		}
		//WAP in java to reverse the words of a sentence while maintaining there order
		String ar[]=new String[space+1];
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=ch)
			{
				for(int j=0;j<ar.length;j++)
				{
					
				}
			}
			
		}
	 }
}
