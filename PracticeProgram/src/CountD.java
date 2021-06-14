import java.util.Scanner;

public class CountD {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num to count the number of digits: ");
		long n=sc.nextLong();
		Dig.displayDigit(n);
		sc.close();
	}
}
class Dig
{
	public static void displayDigit(long num)
	{
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}
