import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to check number is palindrom or not: ");
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n!=0)
		{
			int dig=n%10;
			sum=sum*10+dig;
			n=n/10;
		}
		if(num==sum)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
		sc.close();
	}
}
