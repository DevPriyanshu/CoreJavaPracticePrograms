/*WAP to take number of subject and insert marks of each subject in array.
 Sum of all subject marks and then find of it,s average*/

package array;

import java.util.Scanner;

public class ExamCal 
{
	public static void main(String[] args) {
		
		int sub,i,sum=0;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of subject: ");
		sub=sc.nextInt();
		int ar[]=new int[sub];
		for(i=0;i<sub;i++)
		{
			System.out.println("Enter marks: ");
			ar[i]=sc.nextInt();
		}
		for(i=0;i<sub;i++)
		{
			sum=sum+ar[i];
		}
		System.out.println("Total Marks: "+sum);
		avg=sum/sub;
		System.out.println("Average of total subject : "+avg);
		if(avg>=60)
		{
			System.out.println("1st Division");
		}
		else if(avg>=45 && avg<60)
		{
			System.out.println("2nd Divison");
		}
		else if(avg>=30 && avg<45)
		{
			System.out.println("3rd Division");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
