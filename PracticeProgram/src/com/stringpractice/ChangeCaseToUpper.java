//Wap in java to convert all the lower case letters of a string into uppercse

package com.stringpractice;

import java.util.Scanner;

public class ChangeCaseToUpper {
	public static void main(String[] args) {
		ChangeCase.changeLowerCaseToUpperCAse();
	}
}
class ChangeCase
{
	public static void changeLowerCaseToUpperCAse()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Lower Case Value to Change It's Case:" );
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>=97 && ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>=65 && ch[i]<=91) {
				ch[i]=(char)(ch[i]+32);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			System.out.print(ch[i]);
		}
		sc.close();
	}
}
