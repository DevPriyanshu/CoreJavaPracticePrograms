/*WAP to take 5 element in an array
And Display Prime*/

package array;

import java.util.Scanner;

public class FindPrimeOddEvenMulpliesOfFour 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Num In An Array :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		printEven(ar);
		printOdd(ar);
		printMultipliesOfFour(ar);
		printPrime(ar);
	}
	public static void printEven(int ar[])
	{
		System.out.println("All Even Number");
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
	}
	public static void printOdd(int ar[])
	{
		System.out.println("All Odd Number");
		for(int i=0;i<ar.length;i++) 
		{
			if(ar[i]%2!=0)
			{
				System.out.println(ar[i]);
			}
		}
	}
	public static void printPrime(int ar[])
	{
		System.out.println("All Prime Number");
		for(int i=0;i<ar.length;i++)
		{
			int num=ar[i],j,count=0;
			for(j=1;j<=num;j++)
			{
				if(num%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.print(num+" \t");
			}
		}
	}
	public static void printMultipliesOfFour(int ar[])
	{
		System.out.println("All number are multiplies of 4");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%4==0)
			{
				System.out.println(+ar[i]);
			}
		}
	}
}
