import java.util.Scanner;
class ChangeCase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence In Upper And Lower Csse:");
        String val=sc.nextLine();
        int len=val.length();
        for(int i=0;i<len;i++)
        {
            char ch=val.charAt(i);
            if(ch>64 && ch<91)
            {
                int x=ch+32;
                System.out.print((char)x);
            }
            else if(ch>96 && ch<123)
            {
               int x=ch-32;
               System.out.print((char)x);
            }
            else{
                System.out.print(ch);
            }
        }
    }
}