
import java.util.Scanner;

public class Grade 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int size, i;
		System.out.println("Enter no of student ");
		size = sc.nextInt();
		
		Student all[] = new Student[size];
		
		
		for(i=0;i<size;i++)
		{
			System.out.println("Enter roll");
			int r = sc.nextInt();
						
			System.out.println("Enter Name");
			String n = sc.next();
			
			System.out.println("Enter math marks");
			int m = sc.nextInt();			
			
			System.out.println("Enter Phy marks");
			int p = sc.nextInt();			
			
			System.out.println("Enter Chem marks");
			int c = sc.nextInt();
						
			Student s = new Student();
			s.setRollno(r);
			s.setName(n)
;
			s.setMath(m);
			s.setPhy(p);
			s.setChem(c);
			
			all[i] = s;
		}
		for(i=0;i<size;i++)
		{
			all[i].info();
		    int t = all[i].getMath() + all[i].getPhy() + all[i].getChem();
		    System.out.println("Total Marks Of "+all[i].getName()+" " +t);
		}
	}
}