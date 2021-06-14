package PatternPractice;

public class SolidRectangle {
	public static void main(String[] args) {
		Pat.dispRec();
	}
}
class Pat
{
	public static void dispRec()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
}
