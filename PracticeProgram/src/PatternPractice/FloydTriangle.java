package PatternPractice;

public class FloydTriangle {
	public static void main(String[] args) {
		Floyd.displayFloyd();
	}
}
class Floyd
{
	public static void displayFloyd()
	{
		int flag=1;
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(flag+" ");
				flag++;
			}
			System.out.println();
		}
	}
}
