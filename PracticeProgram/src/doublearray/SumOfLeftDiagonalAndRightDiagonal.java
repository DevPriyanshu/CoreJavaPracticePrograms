/*WAP to accept size of row and column 
And Accept Element in an array
Then Find the Sum of Left Diagonal & right diagonal*/

package doublearray;

import java.util.Scanner;

public class SumOfLeftDiagonalAndRightDiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Row : ");
		int row=sc.nextInt();
		System.out.println("Enter Size Of Column : ");
		int col=sc.nextInt();
		if(row==col)
		{
			int ar[][]=new int[row][col];
			System.out.println("Enter Element In An Array : ");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					ar[i][j]=sc.nextInt();
				}
			}
			System.out.println(" ");
			System.out.println("Array Element!");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(ar[i][j]+"\t");
				}
				System.out.println(" ");
			}
			System.out.println("");
			int ldSum=0,rdSum=0;
			for(int i=0;i<row;i++)
			{
				ldSum=ldSum+ar[i][i];
			}
			System.out.println("Sum Of Left Diagonal "+ldSum);
			System.out.println(" ");
			for(int i=0;i<row;i++)
			{
				rdSum=rdSum+ar[i][(row-1)-i];
			}
			System.out.println("Sum Of Right Diagonal "+rdSum);
			}
		else
		{
			System.out.println();
		}
		}	
}
