public class ButterflyPattern {
	public static void main(String[] args) {
		Butterfly.dispbutterfly();
	}
}
class Butterfly
{
	public static void dispbutterfly()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<8;j++)
			{
				for(int k=i;k<=2;k++)
				{
					System.out.println("*");
				}
			}
		}
	}
}
