package Exception_Handling;

import java.util.Scanner;

public class InputChar {
	public static void main(String[] args) //throws InputErrorException
	{
		char ch=' ';
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any character: ");
		ch=sc.next().charAt(0);
		if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
		{
			System.out.println(" "+ch);
		}
		else
		{
			 new InputErrorException();
				/*
				 * try { throw new InputErrorException(); } catch (Exception mme) {
				 * mme.printStackTrace(); }
				 */
		}
		
	}
}
