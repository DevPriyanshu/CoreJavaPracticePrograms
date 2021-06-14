package PatternPractice;

public class BoundaryStar {
	public static void main(String[] args) {
		Boudary b=new Boudary();
		b.dispBoundary();
	}
}
class Boudary
{
	public void dispBoundary()
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==1 || i==6 || j==1 || j==i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
