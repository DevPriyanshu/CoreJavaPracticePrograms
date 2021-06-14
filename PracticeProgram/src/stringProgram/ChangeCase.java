/*Wap to input string value and change the case of the value and display updated value*/

package stringProgram;

import java.util.Scanner;

public class ChangeCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value: ");
		String value=sc.nextLine();
		int len=value.length();
		for(int i=0;i<len;i++)
		{
			char ch=value.charAt(i);
			if(ch>64 && ch<91)
			{
				int x=ch+32;
				System.out.print((char)x);
			}
			else if(ch>96 && ch<123)
			{
				int x=ch-32;
				System.out.print((char)x);
			}
			else
			{
				System.out.print(ch);
			}
		}
	}
}
