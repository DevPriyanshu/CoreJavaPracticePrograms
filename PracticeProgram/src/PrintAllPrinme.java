import java.util.Scanner;

public class PrintAllPrinme {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num 1: ");
		int n=sc.nextInt();
		System.out.println("Enter num 2: ");
		int n1=sc.nextInt();
		PrimeNum p=new PrimeNum();
		p.displayPrime(n, n1);
		sc.close();
	}
}
class PrimeNum{
	public void displayPrime(int num1,int num2){
		for(int i=num1;i<=num2;i++){
			int flag=0;
			for(int j=2;j<=i-1;j++){
				if(i%j==0){
					flag++;
				}
			}
			if(flag==0){
				System.out.println(i);
			}
		}
	}
}
