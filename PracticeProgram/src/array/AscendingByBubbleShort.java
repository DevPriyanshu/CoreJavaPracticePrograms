/*	WAP to accept the different number in an array .
	And arrange in ascending order by using Bubble Sort technique and display them. */


package array;

import java.util.Scanner;

public class AscendingByBubbleShort 
{
	public static void main(String[] args) {
	
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Element in an array: ");
		for(int i=0;i<5;i++)
		{
			
			ar[i]=sc.nextInt();
		}
		
		int temp=0;
		for(int i=0;i<5-1;i++)
		{
			for(int j=0;j<4-i;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		System.out.println(" ");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
