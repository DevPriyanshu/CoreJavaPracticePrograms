/*Wap to take String input And Display Reverse of String*/

package stringProgram;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String sen=sc.nextLine();
		int len=sen.length();
		String ar[]=sen.split(" ");
		for(int i=len-1;i<=0;i--)
		{
			System.out.println(ar[i].charAt(len-1));
		}
	}
}
