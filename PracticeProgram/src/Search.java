/*Wap to accept size of an array ,and accept element in an array.
Then accept one number.
Search that num is available an array*/
import java.util.Scanner;
class Search
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();

        int ar[]=new int[size];
        System.out.println("Enter element in an array: ");
        for(int i=0;i<size;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter element for search in an array: ");
        int search=sc.nextInt();

        int flag=0;

        for(int i=0;i<size;i++)
        {
            if(ar[i]==search)
             flag++;
        }
        if(flag==1)
        {
            System.out.println(search +" Is Found !");
        }
        else
        {
            System.out.println(search+" Not Found !");
        }
    }
}