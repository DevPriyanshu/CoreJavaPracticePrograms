/*WAP to accept size of array & store temperature in Fahrenheit
  And Display all the temperature converting them inti Celsius.*/

package array;

import java.util.Scanner;

public class ConvertingTemprature {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Room : ");
		int size=sc.nextInt();
		float ar[]=new float[size];
		System.out.println("Enter Temperature  an array In Fahrenheit: ");
		for(int i=0;i<size;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Temrature Of All Room In Fahrenheit!");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar[i]);
		}
		float ar1[]=new float[size];
		for(int i=0;i<size;i++)
		{
			ar1[i]=(ar[i]-32)*5/9;
		}
		System.out.println("After Converting Room Temrature In Fahrenheit!");
		for(int i=0;i<size;i++)
		{
			System.out.println(ar1[i]);
		}
	}
}
