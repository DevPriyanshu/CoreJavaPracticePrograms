import java.util.Scanner;
public class CheckPrime 
{
    public static void main(String[] args) {
        int num,flag=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        num=sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            flag=flag+1;
        }
        if(flag==2)
        {
            System.out.println("Prime: ");
        }
        else
        {
             System.out.println("Not Prime: ");
        }
    }
}