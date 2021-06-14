import java.util.Scanner;

//WAP to calculate the lcm of three integers where the integers are user input
public class FindLCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter An Integer Value To Find It's Input: ");
		int num=sc.nextInt();
		System.out.println("Enter An Integer Value To Find It's Input: ");
		int num1=sc.nextInt();
		LCM.calculateLCM(num,num1);
		sc.close();
	}
}
class LCM
{
	public static void calculateLCM(int num1,int num2)
	{
		int greater=0,smaller=0,lcm=0;
		boolean flag=false;
		if(num1>num2)
		{
			greater=num1;
			smaller=num2;
		}
		else
		{
			greater=num2;
			smaller=num1;
		}
		int greater2=greater;
		while(flag==false)
		{
			if(greater%smaller==0)
			{
				lcm=greater;
				flag=true;
			}
			greater=greater+greater2;
		}
		System.out.println("lcm= "+lcm);
	}
}
