import java.util.Scanner;

public class OddNumByWhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		checkOdd cd=new checkOdd();
		cd.checkOddWhile(n);
		sc.close();
	}
}
class checkOdd
{
	public void checkOddWhile(int num)
	{
		int count=0;
		int i=num+1;
		while(count<10)
		{
			if(i%2!=0)
			{
				System.out.println(i);
				count++;
			}
		}
	}
}


