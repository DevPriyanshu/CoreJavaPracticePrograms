import java.util.Scanner;

public class Ascqi
{
    public static void Print(char ch)
    {
        int ascii=(int)ch;
        System.out.println("Asci Value of " + ch +" is " + ascii);
    }   
    public static void main(String[] args) 
    {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Character Of Print It's Ascii Value: ");
        c=sc.next().charAt(0);
        Ascqi ac=new Ascqi();
        ac.Print(c);
    }
}