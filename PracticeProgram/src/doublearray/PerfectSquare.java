/*WAP to accept element in an array 
And display only those number that are perfect square*/

package doublearray;

import java.util.Scanner;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of An Array: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter element: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		String psq=" ";
		for(int i=0;i<size;i++)
		{
			if(Math.sqrt(ar[i])==Math.floor(Math.sqrt(ar[i])))
			{
				psq=psq+ar[i]+"\t";
			}
		}
		System.out.println("Perfect Square Element !");
		System.out.println(psq);
	}
}
