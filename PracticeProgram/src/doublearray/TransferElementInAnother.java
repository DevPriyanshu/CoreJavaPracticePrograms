/*  WAP to take size of an array And accept element in an array.
	Trasfer And store All even nmber in an even[].
	And all the odd number in another odd[].
	And finally print elements of both array. */

package doublearray;

import java.util.Scanner;

public class TransferElementInAnother {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Array: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element in an array: ");
			ar[i]=sc.nextInt();
		}
		System.out.println("Element in an array !");
		for(int i=0;i<size;i++)
		{
			System.out.print(ar[i]+"\t");
		}
		System.out.println(" ");
		
		int even[]=new int[size];
		for(int i=0;i<size;i++)
		{
			if(ar[i]%2==0)
			{
				even[i]=ar[i];
			}
		}
		System.out.println("All Even Number: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(even[i]+"\t");
		}
		
		System.out.println(" ");
		int odd[]=new int[size];
		for(int i=0;i<size;i++)
		{
			if(ar[i]%2!=0)
			{
				odd[i]=ar[i];
			}
		}
		System.out.println("All odd Number: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(odd[i]+"\t");
		}
	}
}
