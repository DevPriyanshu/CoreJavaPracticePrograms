/*WAP to roll and marks secured in three subject for all student 
the program should check and display roll num along with the message Whether "promotion granded"
or "Not Granted". */

package array;

import java.util.Scanner;

public class Promotion {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Student: ");
		int stu_size=sc.nextInt();
		int stu_roll[]= new int[stu_size];
		
		System.out.println("Enter Number Of Subject: ");
		int sub_size=sc.nextInt();
		String sub_name[]=new String[sub_size];
		for(int i=0;i<sub_size;i++)
		{
			System.out.println("Enter Subject Name: ");
			sub_name[i]=sc.next();
		}
		
		int marks[][]=new int[stu_size][sub_size];
		for(int i=0;i<stu_size;i++)
		{
			System.out.println("Enter Student Roll_No: ");
			stu_roll[i]=sc.nextInt();
			for(int j=0;j<sub_size;j++)
			{
				System.out.println("Enter Marks Of "+sub_name[j]+": ");
				marks[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<stu_size;i++)
		{
			for(int j=0;j<sub_size;j++)
			{
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
	}
}
