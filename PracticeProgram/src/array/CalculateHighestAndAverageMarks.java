/*WAP to input names and marks of student in the subject.
		Calculate & Display
		1-> The Subject Average Marks.
		2-> The Highest Mark In The Subject And The Name Of Student.
		    (the maximum marks in the subject in the subject are 100)*/
package array;

import java.util.Scanner;

public class CalculateHighestAndAverageMarks {
	public static void Calculate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Student: ");
		int stusize=sc.nextInt();
		String name[]=new String[stusize];
		int marks[]=new int[stusize];
		for(int i=0;i<stusize;i++)
		{
			System.out.println("Enter Student Name: ");
			name[i]=sc.next();
			System.out.println("Enter Marks Of "+name[i]+": ");
			marks[i]=sc.nextInt();
		}
		System.out.println("All Student Names And Marks! ");
		for(int i=0;i<stusize;i++)
		{
			System.out.println(name[i]+"\t"+marks[i]);
		}
		int total_marks=0;
		for(int i=0;i<stusize;i++)
		{
			total_marks=total_marks+marks[i];
		}
		float avg=total_marks/stusize;
		System.out.println("Average Of Marks = "+avg);
		int max_marks=marks[0];
		for(int i=0;i<stusize;i++)
		{
			if(marks[i]>max_marks)
			{
				System.out.println(name[i]+" got the highest mark ");
				System.out.println("The marks is "+marks[i]);
			}
		}
	}
	public static void main(String[] args) {
		Calculate();
	}
}

