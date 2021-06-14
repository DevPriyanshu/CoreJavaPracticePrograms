import java.util.Scanner;

public class RevereString {
	public void printReverse(String n)
	{
		StringBuilder str=new StringBuilder();
		str.append(n);
		str.reverse();
		System.out.println(str);
		System.out.println(str);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String value to print it's reverse");
		String n=sc.next();
		RevereString rs=new RevereString();
		rs.printReverse(n);
	}
}
