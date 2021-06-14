package array;
import java.util.Scanner;

   /*WAP to accept the marks in phy,che.math 
	 Secured by 40 students of class
	 Find And display numb of student securing 80% above and 34% below
   */

public class Subject 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,per=0,per1=0;
		
		int phy[]=new int[3];
		int che[]=new int[3];
		int math[]=new int[3];
		
		for(i=0;i<3;i++)
		{
			System.out.println("Enter marks of phy: ");
			phy[i]=sc.nextInt();
			
			System.out.println("Enter marks of che: ");
			che[i]=sc.nextInt();
			
			System.out.println("Enter marks of math :");
			math[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
			if((phy[i] + che[i] + math[i]) / 3 >=80)
				per=per+1;
			if((phy[i] + che[i] + math[i]) / 3 <=34)
				per1=per1+1;
		}
		System.out.println("Number of Securing 80% above in class = "+per);
		System.out.println("Number of Securing 34% below in class = "+per1);
	}
}
