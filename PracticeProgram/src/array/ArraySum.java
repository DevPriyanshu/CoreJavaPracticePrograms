
	/*WAP to accept different numb in a single dimension array(SDA).Display the sum of all
	the number which is divisible by either 3 or 5.*/

package array;

import java.util.Scanner;

public class ArraySum 
{
	public static void Array()
	{
		int size,sum=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Array : ");
		size=sc.nextInt();
		int ar[]=new int[size];
		for(i=0;i<size;i++)
		{
			System.out.println("Enter Num: ");
			ar[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
		{
			if(ar[i]%3==0 || ar[i]%5==0)
			{
				sum=sum+ar[i];
			}
		}
		System.out.println("Sum of the number which is divisible by 3 and 5 : "+sum);
	}
	public static void main(String[] args)
	{
		ArraySum.Array();
	}
}
