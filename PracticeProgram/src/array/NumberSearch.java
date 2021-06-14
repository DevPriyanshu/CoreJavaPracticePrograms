	  /*WAP to take size of an array and the take values of an array.
	    Then take a number and check it's present in an array element */

package array;

import java.util.Scanner;

public class NumberSearch
{
	public static void main(String[] args)
	{
		int size,i,search,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		size=sc.nextInt();
		int ar[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter num in Element: ");
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter num of an element that you want to search: ");
		search=sc.nextInt();
		for(i=0;i<size;i++)
		{
			if(ar[i]==search)
				flag=0+1;	
		}
		if(flag==1)
			System.out.println("Yes , number are present in an array element = "+search);
		else
			System.out.println("No , number are not present in an array element");
	}
}
