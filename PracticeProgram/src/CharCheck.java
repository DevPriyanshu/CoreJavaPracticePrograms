import java.util.Scanner;

public class CharCheck 
{
    public static void Check(char c)
    {
        if((c<='z' && c>='a') || (c<='Z' && c>='A'))
        {
            System.out.println("Input Is Character: ");
        }
        else
        {
            System.out.println("Input Is Not Character");
        }
    }    
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        CharCheck c=new CharCheck();
        System.out.println("Enter Input To Check Charcater Is Not: ");
        ch=sc.next().charAt(0);
        c.Check(ch);
        
    }
}