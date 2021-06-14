package practice;

import java.util.Scanner;

class Check
{
	public void checkPalindrom(int num)
	{
		int flag=num;
		int sum=0;
		while(num!=0)
		{
			int dig=num%10;
			sum=sum*10+dig;
			num=num/10;
		}
		if(flag==sum)
		{
			System.out.println("PALINDROM");
		}
		else
		{
			System.out.println("NOT PALINDROM");
		}
	}
}
public class Palindrom
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to check palindrom is or not");
		int num=sc.nextInt();
		Check ch=new Check();
		ch.checkPalindrom(num);
	}
}
