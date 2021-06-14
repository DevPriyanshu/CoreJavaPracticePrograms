/*WAP to accept size of an array and accept array element.
  Accept new element and position  to user and put the element
  in the given position
*/
package array;

import java.util.Scanner;

public class InsertDeleteElementAtPosition {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int ar[]=new int[size+1];
		
		System.out.println("Enter element in an array :");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter a new element to put in an array :");
		int num=sc.nextInt();
		
		System.out.println("Enter Index postion where you want to put the element :");
		int index=sc.nextInt();
		
		for(int i=size;i>index;i--)
		{
			ar[i]=ar[i-1];
		}
		ar[index]=num;
		
		System.out.println("All element in an array : ");
		for(int i=0;i<size+1;i++)
		{
			System.out.println(+ar[i]);
		}
		System.out.println("Enter position to delete array block: ");
		int del=sc.nextInt();
		
		for(int i=del;i>del;i++)
		{
			ar[i]=ar[i+1];
		}
		System.out.println("Element in an array after delete :");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
