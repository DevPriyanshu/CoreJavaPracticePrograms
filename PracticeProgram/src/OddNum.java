import java.util.Scanner;

public class OddNum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Num: ");
		int n=sc.nextInt();
		PrintOdd po=new PrintOdd();
		po.displayOdd(n);
		sc.close();
	}
}
class PrintOdd
{
	public void displayOdd(int num)
	{
		int count=0;
		for(int i=num+1;count<=10;i++)
		{
			System.out.println(i);
			count++;
		}
	}
}
