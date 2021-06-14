import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num to find it's prime number or not?");
		int n=sc.nextInt();
		Methodology m=new Methodology();
		m.checkPrime(n);
		sc.close();
	}
}
class Methodology
{
	public void checkPrime(int num)
	{
		int flag=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(flag==2)
			System.out.println(num + " is prime !");
		else
			System.out.println(num + " is not prime !");
		
	}
}
