/*	WAP to accept the different number in an array .
	And arrange in ascending order by using Selection Sort technique and display them. */

//Selection 
package array;

//Selection sort
import java.util.Scanner;

public class AscendingArray {
	public static void main(String[] args) {
	
		int ar[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Element in an array: ");
		for(int i=0;i<5;i++)
		{
			
			ar[i]=sc.nextInt();
		}
		
		int temp=0;
		
		for(int i=0;i<5+1;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Ascending order");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		
		for(int i=0;i<5+1;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Descending order");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		
	}
}
