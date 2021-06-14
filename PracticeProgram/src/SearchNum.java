/*WAP to take array of size and input elements in an array. 
and take a number and search number is available or not in an array*/
import java.util.Scanner;
Class SearchNum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter Size of an array : ");
        int size=sc.nextInt();
        int ar[]=new int [size];
        
        for(int i=0;i<size;i++)
        {
            System.out.println("Enter Element in an array : ");
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter Number for search Number is present in an array or not : ");
        int findn=sc.nextInt();
        flag=0;

        for(int i=0;i<size;i++)
        {
            if(ar[i]==findn)
            flag=flag+1;
        }
        if(flag==1)
        {
            System.out.println(findn +"is present in an array. ");
        }
        else
        {
            System.out.println(findn +"is not present ina an array. ")
        }
    }
}