		/* WAP a program to accept size of an array and then input numb in array .Display
			the greatest and the smallest number of the array elements */

package array;

import java.util.Scanner;

public class Find 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array ;");
		int size=sc.nextInt();
		
		int ar[]=new int[size];
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Enter Element In An Array: ");
			ar[i]=sc.nextInt();
		}
		
        int greater=ar[0];
        int smaller=ar[0];
        
        for(int i=0;i<ar.length;i++)
        {
        	if(ar[i]>greater)
        	{
        		greater=ar[i];
        	}
        	if(ar[i]<smaller)
        	{
        		smaller=ar[i];
        	}
        }
        
        System.out.println("Big Element in an array is = "+greater);
        System.out.println("Small Element in an array is = "+smaller);
	}
}
