import java.util.Scanner;

//write a java program to print all the factor all well as the number of factor of n.

public class Factor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num: ");
		int n=sc.nextInt();
		Find f=new Find();
		f.PrintFactor(n);
		sc.close();
	}
}
class Find
{
	public void PrintFactor(int num)
	{
		int flag=0;
		System.out.println("Factors of "+num);
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i );
				flag++;
			}
		}
		System.out.println("numbers of factor: "+flag);
	}
}
