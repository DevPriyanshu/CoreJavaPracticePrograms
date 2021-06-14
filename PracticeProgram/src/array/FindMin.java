package array;

import java.util.Scanner;

public class FindMin 
{
	public static void main(String[] args) 
	{
		int ar[]=new int[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.println("Enter the "+ i +" element in an array to find the MAX_ELEMENTS: ");
			ar[i]=sc.nextInt();
		}
		 
		System.out.println("Element Of An Array !");
		for(int i=0;i<ar.length-1;i++)
		{
			System.out.println(ar[i]);
		}
		
		int MIN=ar[0];
		for(int i=0;i<ar.length-1;i++)
		{
			if (ar[i]<MIN)
			{
				MIN=ar[i];
			}
		}
		
		System.out.println("The MAXIMUN Element Of An Array Is "+MIN);
		
	}
}
