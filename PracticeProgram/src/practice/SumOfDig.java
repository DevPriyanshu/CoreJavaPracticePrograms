package practice;

import java.util.Scanner;

public class SumOfDig
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num to sum of Digit: ");
		int num=sc.nextInt();
		int dig,sum=0;
		while(num!=0)
		{
			dig=num%10;
			sum=sum+dig;
			num=num/10;
		}
		System.out.println(+sum);
	}
}
