import java.util.Scanner;

public class SubSet {
	public static void main(String[] args) {
		FindSubSet.dispSubSetBetweenTwoArray();
	}
}
class FindSubSet
{
	public static void dispSubSetBetweenTwoArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array: ");
		int s1=sc.nextInt();
		int ar1[]=new int[s1];
		for(int i=0;i<s1;i++)
		{
			ar1[i]=sc.nextInt();
		}
		System.out.println("Enter size of 2nd array: ");
		int s2=sc.nextInt();
		int ar2[]=new int[s2];
		for(int i=0;i<s2;i++)
		{
			ar2[i]=sc.nextInt();
		}
		System.out.println("1st array element !");
		for(int i=0;i<s1;i++)
		{
			System.out.println(ar1[i]+" ");
		}
		System.out.println("2nd array element !");
		for(int i=0;i<s2;i++)
		{
			System.out.println(ar2[i]+" ");
		}
		
		boolean subset = true,flag=false;
		for(int i=0;i<s1;i++)
		{
			for(int j=0;j<s2;j++)
			{
				if(ar1[i]==ar2[j])
				{
					flag=true;
				}
			}
			if(flag==false)
			{
				subset=false;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(subset==true)
		{
			System.out.println("SubSet");
		}
		else
		{
			System.out.println("Not Subset");
		}
	}
}
