/*WAP to accept size of array ANd accept element in an array.
 And then search And Display min or max element */
import java.util.Scanner;
class MinNumMaxNum
{
    private static void checkMinMax() 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size=s.nextInt();

        int ar[]=new int[size];

        System.out.println("Enter Element In An Array: ");

        for(int i=0;i<size;i++)
        {
            ar[i]=s.nextInt();
        }

        int min=ar[0];
        int max=ar[0];

        for(int i=0;i<size;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
            
            else if(ar[i]>max)
            {
                max=ar[i];
            }
        }
        System.out.println("MAximun num Is = "+max);
        System.out.println("Minimun num Is = "+min);
    }
    public static void main(String[] args) {
        MinNumMaxNum.checkMinMax();
    }
}