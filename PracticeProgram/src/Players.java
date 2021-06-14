import java.util.Scanner;

public class Players 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size Of An Array in Even Number: ");
		int size=sc.nextInt();
		int[] tiles = new int[size];
			
		System.out.println();
		System.out.println("Enter Element in an array: ");
		for(int i=0;i<tiles.length;i++)
		{
			tiles[i]=sc.nextInt();
		}
		
		int[] nilofar=new int[size/2];
		int[] priyanshu=new int[size/2];
		
		for(int i=0;i<size/2;i++)
		{
			System.out.println("Nilofar, Choose the Element From Given Element: ");
			int n=sc.nextInt();
			nilofar[i]=n;
			
			System.out.println("Priyanshu, Choose the Element From Given Element: ");
			int p=sc.nextInt();
			priyanshu[i]=p;
		}
		
		System.out.println();
		
		System.out.print("Nilofar Element is :");
		for(int i=0;i<nilofar.length;i++)
		{
			System.out.print(nilofar[i]+"  ");
		}
		
		System.out.println();
		
		System.out.print("Priyanshu Element is :");
		for(int i=0;i<nilofar.length;i++)
		{
			System.out.print(priyanshu[i]+"  ");
		}
		
		System.out.println();
		
		int nilofarusum=0;
		for(int i=0;i<size/2;i++)
		{
			nilofarusum=nilofarusum+nilofar[i];
		}
		
		int priyansusum=0;
		for(int i=0;i<size/2;i++)
		{
			priyansusum=priyansusum+priyanshu[i];
		}
		
		System.out.println();
		System.out.println("Sum Of Nilofar choosen Element: "+nilofarusum);
		System.out.println();
		System.out.println("Sum Of Priyanshu choosen Element: "+priyansusum);

	}
}
