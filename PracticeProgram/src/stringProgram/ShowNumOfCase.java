/*Wap to accept string value Ans Show
i) How many lower case 
ii) H?ow many upper case
iii)How many Special character
iv)how many digit present in string
*/
package stringProgram;

import java.util.Scanner;

public class ShowNumOfCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value");
		String in=sc.nextLine();
		int len=in.length();
		int uc=0 , lc=0 , sc1=0 , dig=0;
		for(int i=0;i<len;i++)
		{
			char ch=in.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				uc++;
			}
			else if(ch>='a' && ch<='z')
			{
				lc++;
			}
			else if(ch>='0' && ch<='9')
			{
				dig++;
			}
			else
			{
				sc1++;
			}
		}
		System.out.println("Upper case is: "+uc +" Lower case is: "+lc 
						+" Special character is: "+sc1 +" Digit is: "+dig);
	}
}
