import java.util.Scanner;

public class Pr
 {
    public static void main(String[] args) {
        int num,flag=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        num=sc.nextInt();
        for(i=1;i<=num;i++)
        {
            if(num%i==0)
            flag=flag+1;
        }
        if(flag==2)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }    
}