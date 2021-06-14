
//WAP to 

import java.util.Scanner;
public class FabonicciSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num to print it's fabonicci series: ");
		int num=sc.nextInt();
		Fab.dispFabonicci(num);
		sc.close();
	}
}
class Fab
{
	public static void dispFabonicci(int num)
	{
		int a=0,b=1,sum=0;
		System.out.println("The Fabonicci Series Of "+num+" is !");
		for(int i=1;i<=num-2;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}
}

