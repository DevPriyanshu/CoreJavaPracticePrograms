package array;

import java.util.Scanner;

public class SplitSpecifiedPosition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an array: ");
		int size=sc.nextInt();
		
		int ar[]=new int[size];
		
		System.out.println("Enter Element In An Array : ");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter index num Where you want to split : ");
		int index=sc.nextInt();
		
		int ar1[]=new int[index];
		int ar2[]=new int[size-index];
		
		for(int i=0;i<index;i++)
		{
			ar1[i]=ar[i];
		}
		for(int j=0;j<size-index;j++)
		{
			ar2[j]=ar[j+index];
		}
		System.out.println("1st Array !");
		for(int i=0;i<index;i++)
		{
			System.out.println(ar1[i]);
		}
		System.out.println("2nd Arrar");
		for(int j=0;j<size-index;j++)
		{
			System.out.println(ar2[j]);
		}
	}
}
