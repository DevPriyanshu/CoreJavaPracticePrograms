

public class Pat {
	public static void main(String[] args) {
		RecWithStarAndDig.printRec();
	}
}
class RecWithStarAndDig
{
	public static void printRec()
	{
		int m=5,n=5,count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=m;j++)
			{
				if(i==1 || i==n || j==1 || j==m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(count++);
				}
			}
			System.out.println();
		}
	}
}
