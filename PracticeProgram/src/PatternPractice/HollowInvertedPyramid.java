package PatternPractice;

public class HollowInvertedPyramid {
	public static void main(String[] args) {
		HollowInverted.printHollow();
	}
}
class HollowInverted
{
	public static void printHollow()
	{
		for(int i=0;i<6;i++)
		{
			for(int j=i;j<6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}