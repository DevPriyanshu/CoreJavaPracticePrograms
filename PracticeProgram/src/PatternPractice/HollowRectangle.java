package PatternPractice;

public class HollowRectangle {
	public static void main(String[] args) {
		Hollow.dispHollow();
	}
}
class Hollow
{
	public static void dispHollow()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0 || j<5)
				System.out.print("*  ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
