
public class Print1234InRectacngle {
	public static void main(String[] args) {
		Print.print1234();
		Print1.printLineNum();
		Print2.printNum();
		FourToOneInRectangle.print();
		FourToOneInRevRectangle.print();
	}
}
class Print
{
	public static void print1234()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
class Print1
{
	public static void printLineNum()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
class Print2
{
	public static void printNum()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i+4);
			}
			System.out.println();
		}
	}
}
class FourToOneInRectangle
{
	public static void print()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j--)
			{
				//System.out.print();
			}
			System.out.println();
		}
	}
}
class FourToOneInRevRectangle
{
	public static void print()
	{
		for(int i=4;i<=1;i--)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}