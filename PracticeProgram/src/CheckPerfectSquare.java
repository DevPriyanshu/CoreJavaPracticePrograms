import java.util.Scanner;

public class CheckPerfectSquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to check it is Perfect Square or not: ");
		int num=sc.nextInt();
		if(Math.sqrt(num)==Math.floor(Math.sqrt(num)))
		{
			System.out.println("Yes It Is Perfect Square ! ");
		}
		else
		{
			System.out.println("No, It Is Not Perfect Square ! ");
		}
	}
}
