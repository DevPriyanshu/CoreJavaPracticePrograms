import java.util.Scanner;
class Ascending
{
    private static void printAscending(int size)
    {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[size];
        System.out.println("Enter element in an array : ");
        for(int loop=0;loop<size;loop++)
        {
            ar[loop]=sc.nextInt();
        }
        int num=0;
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(ar[i]>ar[j])
                {
                    num=ar[i];
                    ar[i]=ar[j];
                    ar[j]=num;
                }
            }
        }
        System.out.println("After Sorting in Ascending order array..");

        for(int i=0;i<size;i++)
        {
            System.out.println(+ar[i]);
        }
    }
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=sc.nextInt();
        Ascending.printAscending(size);
        
    }
}