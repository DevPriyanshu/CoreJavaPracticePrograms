package practice;

import java.util.Scanner;

class CheckArmstrong {
	public void checkArmstrong(int num)
	{
		int flag=num;
		int sum=0;
		while(num!=0)
		{
			int dig=num%10;
			num=num/10;
			sum=sum+dig*dig*dig;
		}
		if(flag==sum)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}
class Armstrong
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to number is armstrong or not !");
		int num=-sc.nextInt();
		CheckArmstrong cm=new CheckArmstrong();
		cm.checkArmstrong(num);
	}
}
