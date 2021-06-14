import java.util.Scanner;

public class Fabonicci
 {
    public static void main(String[] args) {
        int num,a=0,b=1,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num:");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(+sum);
        }
    }
}