package practice;

public class Prime extends Number
{
	public  void chekPrime()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			count++;
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}
