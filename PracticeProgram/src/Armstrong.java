
class Armstrong
{
	public static void checkArmstrongInThreePower(int num)
	{
		int sum=0,flag=num;
		while(num!=0)
		{
			int dig=num%10;
			num=num/10;
			sum=sum+dig*dig*dig;
		}
		if(flag==sum)
		{
			System.out.println(flag+" Armstrong Number");
		}
		else
		{
			System.out.println(flag+" Not Armstrong Number");
		}
	}
	public static void main(String[] args) {
		checkArmstrongInThreePower(371);
	}
}