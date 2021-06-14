import java.util.Scanner;

public class ArmstrongForFourSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num to Find armstrong: ");
		int num=sc.nextInt();
		int sum=0,flag=num,d=0;
		while(num<0)
		{
			num=num/10;
			d++;
		}
		while(num<0)
		{
			int dig=num%10;	
			num=num/10;
			sum=(int)(sum+Math.pow(dig, d));
		}
		if(flag==sum)
		{
			System.out.println("Armstrong Num");
		}
		else
		{
			System.out.println("Not Armsrong");
		}
		sc.close();
	}
}


