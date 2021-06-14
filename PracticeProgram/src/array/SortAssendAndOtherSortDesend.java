/*WAP to take size of an array then accept element in an array
 * and sort half array in assending and next half in descending 
 * print the complete list of an array. */

package array;

import java.util.Scanner;

public class SortAssendAndOtherSortDesend {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter Element In An Array: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("All Element In An Array!");
		for(int i=0;i<size;i++)
		{
			System.out.print(ar[i]+"\t");
		}
		System.out.println(" ");
		int temp=0;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}	
			}
		}
		System.out.println("First Half  Assending !");
		for(int i=0;i<size/2;i++)
		{
			System.out.println(ar[i]);
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}	
			}
		}
		System.out.println("Last Half  Descending !");
		for(int i=size/2;i<size;i++)
		{
			System.out.println(ar[i]);
		}
	}
}
