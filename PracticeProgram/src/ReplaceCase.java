import java.util.Scanner;
class ReplaceCase
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Sentence: ");
        String sen=sc.nextLine();
        int len=sen.length();
        for(int i=0;i<len;i++)
        {
            char ch=sen.charAt(i);
            if(ch=='e')
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}