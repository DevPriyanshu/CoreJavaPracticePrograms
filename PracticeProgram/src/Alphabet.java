import java.util.Scanner;

public class Alphabet 
{
    public static void checkAlpha(char c)
    {
         if((c>='a' && c<='z' )||(c>='A' && c<='Z'))
         {
             System.out.println("Alphabet");
         }
         else
         {
             System.out.println("Not Alphabet");
         }
    }   
    public static void main(String[] args) 
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        Alphabet obj=new Alphabet();
        System.out.println("Enter Char");
        ch=sc.next().charAt(0);
        obj.checkAlpha(ch);
    }
}