/*WAP to Accept size of array In 2d. And transpose the matrix by using assingment statement.
the transpose of matrix is obtained when we change the row element into column
and column elements into row element
*/

package doublearray;

import java.util.Scanner;

public class TransposeRowColumn {
	public static void TransposeArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter Size Of column: ");
		int column=sc.nextInt();
		
		int ar[][]=new int[row][column];
		
		System.out.println("Enter element in an Array: ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Array Elements!");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(ar[i][j] +"\t");
			}
			System.out.println(" ");
		}
		
		int ar1[][]=new int[column][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				ar1[j][i]=ar[i][j];
			}
		}
		
		System.out.println("After Traspose Array Elements!");
		for(int i=0;i<column;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(ar1[i][j] +"\t");
			}
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		TransposeRowColumn.TransposeArray();
	}
}
