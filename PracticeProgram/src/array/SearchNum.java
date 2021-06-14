package array; 

/*WAP to take array of size and input elements in an array. 
and take a number and search number is available or not in an array*/
import java.util.Scanner;


class SearchNum
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Size of an Array: ");
       int size=sc.nextInt();
       
       int ar[]=new int[size];
       
       for(int i=0;i<size;i++)
       {
    	   System.out.println("Enter element in an arrya: ");
    	   ar[i]=sc.nextInt();
       }
  
       System.out.println("Enter num that you can serach in array elemnet present or not: ");
       int searchnum=sc.nextInt();
       int flag=0;
       for(int i=0;i<size;i++)
       {
    	   if(ar[i]==searchnum)
    		   flag=flag+1;
       }
       if(flag==1)
       {
    	   System.out.println(+searchnum +" IS PRESENT AN ARRAY");
       }
       else
       {
    	   System.out.println(+searchnum +" IS NOT PRESENT AN ARRAY");
       }
    }
}