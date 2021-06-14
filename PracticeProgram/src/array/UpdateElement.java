package array;

import java.util.Scanner;

public class UpdateElement {
	public static void main(String[] args) {
		int i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size=sc.nextInt();
		
		int ar[]=new int[size];
		
		System.out.println("Enter Element in An Array : ");
		for(i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Enter Existing Num: ");
		int num=sc.nextInt();
		
		System.out.println("Enter New Number To Update: ");
		int update=sc.nextInt();
		
		for(i=0;i<size;i++)
		{
			if(ar[i]==num)
			{
				ar[i]=update;
				flag=1;
			}
		}
		if(flag==1)
		{
			for(i=0;i<size;i++)
			{
				System.out.println(ar[i]);
			}
		}
		else
		{
			System.out.println("Existing Num Is not valid ");
		}
	}
}
