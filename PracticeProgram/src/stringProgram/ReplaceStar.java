/*Wap to accept lower case value and replace "e" with "*"  in th given input and display value */

package stringProgram;

import java.util.Scanner;

public class ReplaceStar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string value in lower case");
		String value=sc.next();
		int len=value.length();
		for(int i=0;i<len;i++)
		{
			char ch=value.charAt(i);
			if(ch=='e')
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(ch);
			}
		}	
	}
}
