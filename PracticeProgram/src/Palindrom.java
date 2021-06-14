import java.util.Scanner;

public class Palindrom
 {
    public static void main(String[] args) {
        int num,dig,rev=0,flag;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num");
        num=sc.nextInt();
        flag=num;
        while(num!=0)
        {
            dig=num%10;
            rev=rev*10+dig;
            num=num/10;
        }
        if(rev==flag)
        {
            System.out.println("Palindrom:");
        }
        else
        {
            System.out.println("Not Palindrom:");
        }
    }
}