import java.util.Scanner;

public class CalculatorApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int a=sc.nextInt();
		System.out.println();
		System.out.println("Enter 2nd Number: ");
		int b=sc.nextInt();
		System.out.println();
		System.out.println("Please enter operator for Add(+) , Subtract(-) , Multiply(*) and Divide(/)  :");
		char c=sc.next().charAt(0);
		Calculator.displayCalculator(a, b, c);
		sc.close();
	}
}
class Calculator
{
	public static void displayCalculator(int num1, int num2, char operator){
		double d=0.0;
		switch(operator){
			case '+': d=num1+num2;
			break;
			
			case '-': d=num1-num2;
			break;
			
			case '*': d=num1*num2;
			break;
			
			case '/': d=num1/num2;
			break;
		}
		System.out.println();
		System.out.println(num1+" "+operator+" "+num2+" = "+d);
	}
}
