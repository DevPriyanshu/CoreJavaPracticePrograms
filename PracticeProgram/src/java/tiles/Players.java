package java.tiles;

import java.util.Scanner;
public class Players {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] ar = new int[]{22,9,4,89};
		System.out.println("Pick Up any number by enter it,s position of index !!");
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(i +"Postion........."+ar[i]);
		}
	}
}
