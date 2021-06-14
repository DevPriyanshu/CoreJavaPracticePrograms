package PatternPractice;

public class HalfPyramid {
	public static void main(String[] args) {
		Pyramid p=new Pyramid();
		p.dispPiramid();
	}
}
class Pyramid
{
	public void dispPiramid()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
