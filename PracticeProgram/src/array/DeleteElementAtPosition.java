package array;

import java.util.Scanner;

public class DeleteElementAtPosition 
{
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size :");
			int size=sc.nextInt();
			
			int ar[]=new int[size];
			System.out.println("Enter element :");
			for(int i=0;i<size;i++)
			{
				ar[i]=sc.nextInt();
			}
			System.out.println("Enter index postion where you want to delete the element: ");
			int index=sc.nextInt();
			
			if(index>=0 && index<size)
			{
				for(int i=index;i>size;i++)
				{
					ar[i]=ar[i+1];
				}
				System.out.println("Array element is:");
				for(int i=0;i<size-1;i++)
				{
					System.out.println(+ar[i]);
				}
			}
			else
			{
				System.out.println("Index is not valid");
			}
		}	
}
