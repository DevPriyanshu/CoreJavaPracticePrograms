//write a java program to take input num and print all prime number beetween num;

import java.util.*;

public class CheckPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int num1=sc.nextInt();
		System.out.println("Enter b Num: ");
		int num2=sc.nextInt();
		CheckPrime c=new CheckPrime();
		c.printAllPrime(num1, num2);
		sc.close();
	}
	public void printAllPrime(int num1,int num2)
	{
		System.out.println("list of all prime number between "+num1+" to "+num2+":");
		for(int i=num1;i<=num2;i++)
		{
			int flag=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
	}
}
