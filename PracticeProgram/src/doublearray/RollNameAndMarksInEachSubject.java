/*WAP
1-> To accept number of student And number of subject  
2-> Store roll no. with student  name and marks in each subject
3-> Calculate the percentage of marks obtained by each candidate.
4-> Calculate the grade as per given criteia.
   	 
   	  Percentage marks			Grade
   	  from 80 to 100  			  A
   	  from 60 to 79  			  B
   	  from 40 to 59 			  C	
   	  Less Than 40                D    
 */
package doublearray;

import java.util.Scanner;

public class RollNameAndMarksInEachSubject {
	public void Solve() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Student: ");
		int stusize=sc.nextInt();
		String stuname[]=new String[stusize];
		
		System.out.println("Enter Number Of Subject: ");
		int subsize=sc.nextInt();
		String subname[]=new String[subsize];
		
		for(int i=0;i<subsize;i++)
		{
			System.out.println("Enter Subject Name: ");
			subname[i]=sc.next();
		}
		
		int roll[]=new int[stusize];
		int marks[][]=new int[stusize][subsize];
		for(int i=0;i<stusize;i++)
		{
			System.out.println("Enter roll_no :");
			roll[i]=sc.nextInt();
			System.out.println("Enter Student name: ");
			stuname[i]=sc.next();
			for(int j=0;j<subsize;j++)
			{
				System.out.println("Enter Marks Of "+subname[j]+": ");
				marks[i][j]=sc.nextInt();
			}
		}
		System.out.println("Details Of All Student");
		System.out.println("Roll_no"+"\t"+"Student_name"+"\t");
		for(int i=0;i<stusize;i++)
		{
			System.out.print(roll[i]+"\t");
			System.out.print(stuname[i]+"\t");
			for(int j=0;j<subsize;j++)
			{
				System.out.print(marks[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		RollNameAndMarksInEachSubject obj=new RollNameAndMarksInEachSubject();
		obj.Solve();
	}
}
