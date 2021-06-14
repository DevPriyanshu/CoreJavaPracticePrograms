/*WAP to take no. of student 
 then number of subject 
 then take subject name 
 then take Student name
 then take marks of subject by student
 and then print All student name with marks on each subject */

package doublearray;

import java.util.Scanner;

public class ShowResult 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number of student: ");
		int stusize=sc.nextInt();
		
		String stun[]=new String[stusize];
		
		System.out.println("Enter number of subject: ");
		int subsize=sc.nextInt();
		
		String subn[]=new String[subsize];
		
		
		for(int i=0;i<subsize;i++)
		{
			System.out.println("Enter subject : ");
			subn[i]=sc.next();
		}
		
		int size[][]=new int[stusize][subsize];
		
		for(int i=0;i<stusize;i++)
		{
			System.out.println("Enter student name: ");
			stun[i]=sc.next();
			
			for(int j=0;j<subsize;j++)
			{
				System.out.println("Enter marks of "+subn[i] +": ");
				size[i][j]=sc.nextInt();
			}
		}
	}	
}
