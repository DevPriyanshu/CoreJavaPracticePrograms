
public class RectanglePattern {
	public static void main(String[] args) {
		Rectangle.printRectangle();
		Rectangle.DispRectangleByLoop();
	}
}
class Rectangle
{
	public static void printRectangle()
	{
		for(int i=0;i<4;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<4;i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	public static void DispRectangleByLoop()
	{
		System.out.println("By For Loop");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
