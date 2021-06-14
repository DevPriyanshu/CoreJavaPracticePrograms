
public class Print10to90 {
	public static void main(String[] args) {
		PrintPat.disp();
	}
}
class PrintPat
{
	public static void  disp()
	{
		int count=10;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print(count);
				count=count+10;
			}
			System.out.println();
		}
	}
}
