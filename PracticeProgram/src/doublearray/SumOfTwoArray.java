/*WAP to store the numb in two different 2d array. and Print sum of all element in 
two different array in one array*/

package doublearray;

import java.util.Scanner;

public class SumOfTwoArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size Of Row :");
		int row=sc.nextInt();
		System.out.println("Enter Size of Column :");
		int col=sc.nextInt();
		int ar[][]=new int[row][col];
		int ar1[][]=new int[row][col];
		System.out.println("Enter element in 1st Array :");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ar[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter element in 2nd Array :");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ar1[i][j]=sc.nextInt();
			}
		}
		System.out.println("element Of 1st Array :");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("element of 2nd Array :");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(ar1[i][j]+"\t");
			}
			System.out.println(" ");
		}
		int ar2[][]=new int [row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				ar2[i][j]=ar[i][j]+ar1[i][j];
			}
		}
		System.out.println("Sum Of Array 1 & 2 Is ! ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(ar2[i][j]+"\t");
			}
			System.out.println(" ");
		}
	}
	
}
