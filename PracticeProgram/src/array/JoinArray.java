package array;

import java.util.Scanner;

public class JoinArray {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1st Array Size: ");
			int size1=sc.nextInt();
			
			int ar1[]=new int[size1];
			
			System.out.println("Enter 2nd Array Size: ");
			int size2=sc.nextInt();
			
			int ar2[]=new int[size2];
			
			System.out.println("Enter Element in 1st Array: ");
			for(int i=0;i<size1;i++)
			{
				ar1[i]=sc.nextInt();
			}
			
			System.out.println("Enter Element in 2nd Array: ");
			for(int i=0;i<size2;i++)
			{
				ar2[i]=sc.nextInt();
			}
			int ar3[]=new int[size1+size2];
			
			for(int i=0;i<size1;i++)
			{
				ar3[i]=ar1[i];
			}
			for(int i=size1;i<size1+size2;i++)
			{
				ar3[i]=ar2[i-size1];
			}
			System.out.println("Array After Join!");
			for(int i=0;i<size1+size2;i++)
			{
				System.out.println(ar3[i]);;
			}
		}
}
