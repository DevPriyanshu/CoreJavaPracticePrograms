/*WAP To accept the size of numb And  Accept the Numb in Element. And check it is Symmetric or not
means if Row And column length us equal then it's Symmetric then not.
*/
package doublearray;

import java.util.Scanner;

public class CheckSymmetric {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Row : ");
		int row=sc.nextInt();
		System.out.println("Enter Size Of Column : ");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		System.out.println("Enter Element In An Array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		if(row==col)
		{
			System.out.println("Symmetric");
		}
		else
		{
			System.out.println("Not Symmetric");
		}
	}
}
