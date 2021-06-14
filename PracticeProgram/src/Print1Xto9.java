
public class Print1Xto9 {
	public static void main(String[] args) {
		Print1X.print();
	}
}
class Print1X
{
	public static void print()
	{
		for(int i=1;i<=3;i++)
		{
			int flag=1;
			for(int j=1;j<=3;j++)
			{
				System.out.print(flag++);
				if(j<3)
				{
					System.out.print("x");
				}
			}
			System.out.println();
		} 
	}
}