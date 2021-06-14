
//check whether given string is substring of another or not?
package com.stringpractice;
import java.util.Scanner;

public class CheckSubString {
	
}
class CheckSub
{
	public static void checkSubStr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value: ");
		String str=sc.nextLine();
		System.out.println("Enter String Value To Check It's A Substring Or Not?");
		String str1=sc.nextLine();
		char[] ch1=str.toCharArray();
		char[] ch2=str1.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(str.substring(i, i+str1.length()))
		}
		
	}
}