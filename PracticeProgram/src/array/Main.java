/*Q-> WAP a program to accept name and total marks of N number of student in two SDA name[] & marks[].
      
      -> Calculate And Print
	
		1)Average of total marks obtained by n number of student
		  [average = (sum of total marks of all students)/N].
	
	    2)Deviation of each student total marks with the average.
		  deviation = total marks of student - average. */ 

package array;
import java.util.Scanner;
class StudentAndMarkCalculation {
	public static void averageMarksOfStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Student: ");
		int Stu_Numb=sc.nextInt();
		String StuN[]=new String[Stu_Numb];
		int marks[]=new int[Stu_Numb];
		for(int i=0;i<Stu_Numb;i++) {
			System.out.println("Enter Student Name: ");
			StuN[i]=sc.next();
			System.out.println("Enter Marks Of "+StuN[i]);
			marks[i]=sc.nextInt();
		}
		System.out.println(" ");
		System.out.println("All Student Name With Total Marks!");
		System.out.println("Name"+"\t"+"Total_Marks");
		for(int i=0;i<Stu_Numb;i++) {
			System.out.println(StuN[i]+"\t"+marks[i]+"\t");
		}
		System.out.println(" ");
		int sum=0;
		for(int i=0;i<Stu_Numb;i++) {
			sum=sum+marks[i];
		}
		float avg=sum/Stu_Numb;
		System.out.println("Average Of Total Marks Obtained By "+Stu_Numb +" Student = " + avg);
		int tmark=0;
		for(int i=0;i<Stu_Numb;i++)
		{
			
		}
	}
	
}

public class Main { 
	public static void main(String[] args) {
		StudentAndMarkCalculation.averageMarksOfStudent(); 
		} 
}

