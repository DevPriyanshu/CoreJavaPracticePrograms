package stringarray;

import java.util.Scanner;

public class SearchAlphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int size=sc.nextInt();
		String ar[]=new String [size];
		System.out.println("Enter Alphabet");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.next();
		}
		System.out.println("Enter element do you want to search:");
		String search=sc.next();
		boolean flag=false;
		for(int i=0;i<size;i++)
		{
			if(ar[i]==search)
			{
				flag=true;
			}			
		}
		if(flag==true)
		{
			System.out.println("Available");
		}
		else
		{
			System.out.println("Not Available");
		}
	}
}
