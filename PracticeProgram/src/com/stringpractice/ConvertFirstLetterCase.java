//WAP in java to convert first lettter of all the word in upper case

package com.stringpractice;


import java.util.Scanner;

public class ConvertFirstLetterCase {
	public static void main(String[] args) {
		FistWordChange.changeFirstWordCase();
	}
}
class FistWordChange
{
	public static void changeFirstWordCase()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence: changeFirstWordCase()");
		String sen=sc.nextLine();
		char[] ch=sen.toCharArray();
		ch[0]=(char) (ch[0]-32);
		for(int i=1;i<sen.length();i++)
		{
			if(ch[i]==' ')
			{
				
			}
		}
	}
}