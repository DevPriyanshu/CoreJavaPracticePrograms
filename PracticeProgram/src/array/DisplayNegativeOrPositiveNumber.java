/*WAP to accept the size of an array and accept positive or negative number
And Display The All Negative followed by the Positive NUmber without changing of order 
of the number*/

package array;

import java.util.Scanner;

public class DisplayNegativeOrPositiveNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size Of An Array: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter Element In Array: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("All Element Of Array: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(ar[i]+"\t");
		}
		System.out.println(" ");
		String Pos="",Neg="";
		for(int i=0;i<size;i++)
		{
			if(ar[i]<0)
			{
				Neg=Neg+ar[i]+"\t";
			}
			else
			{
				Pos=Pos+ar[i]+"\t";
			}
		}
		System.out.println("Negative And Positive Number Is:");
		System.out.println(Neg+Pos);
	}
}
