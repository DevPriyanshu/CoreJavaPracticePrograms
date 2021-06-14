/*Wap to input string and count number of vowel And Display it*/

package stringProgram;

import java.util.Scanner;

public class CountVowel {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Value");
		String n=sc.nextLine();
		int len=n.length();
		int vowel=0;
		for(int i=0;i<len;i++)
		{
			char ch=n.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' || ch=='u'
			|| ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
			{
				vowel++;
			}
		}
		System.out.println("The Number Of Vowel Is In Your Input: "+vowel);
	}
}
