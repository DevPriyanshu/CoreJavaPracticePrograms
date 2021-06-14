/*Wap to takt String input to user and display the initials along with the surname*/

package stringProgram;

import java.util.Scanner;

public class DisplaySurname {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name With The SurName: ");
		String name=sc.nextLine();
		
		String strar[]=name.split(" ");
		int len=name.length();
		for(int i=0;i<len-1-1;i++)
		{
			System.out.println(strar[i].charAt(0)+".");
		}
		System.out.println(strar[len-1]);
	}
}
