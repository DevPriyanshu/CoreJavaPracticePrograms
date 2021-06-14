package constructor;

public class Prime 
{
	int num,flag;
	Prime()
	{
		num=5;
		flag=0;
	}
	public void checkPrime()
	{
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				flag=flag+1;
			}
		}
		if(flag==2)
		{
			System.out.println("Prime Num: ");
		}
		else
		{
			System.out.println("Not Prime: ");
		}
	}
	public static void main(String[] args) 
	{
		Prime p=new Prime();
		p.checkPrime();
	}
}
