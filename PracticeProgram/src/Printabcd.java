
public class Printabcd {
	public static void main(String[] args) {
		PrintP.displayPat();
	}
}
class PrintP
{
	public static void displayPat()
	{
		for(int i='a';i<='d';i++)
		{
			for(int j='a';j<='d';j++)
			{
				System.out.print((char)j);
			}
			System.out.println();
		}
	}
}
