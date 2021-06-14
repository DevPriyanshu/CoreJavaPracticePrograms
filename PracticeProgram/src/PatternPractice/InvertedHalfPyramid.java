package PatternPractice;

public class InvertedHalfPyramid {
	public static void main(String[] args) {
		HalfInvertedPyramid h=new HalfInvertedPyramid();
		h.displInvertedHalfPyramid();
	}
}
class HalfInvertedPyramid
{
	public void displInvertedHalfPyramid()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j<=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
