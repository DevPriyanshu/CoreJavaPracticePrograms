package doublearray;

import java.util.Scanner;

public class Priynshu
{
    public static void main(String args[])
    {
        int stusize,subsize,marks[][],i,n;
        String name[],subject[];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter No of Student : ");
        stusize = sc.nextInt();
        
        name = new String[stusize];
        
        System.out.println("Enter No of Subject : ");
        subsize = sc.nextInt();
        
         subject = new String[subsize];
        
        for(i=0;i<subsize;i++)
        {
            System.out.println("Enter Subject Name: ");
            subject[i] = sc.next();
        }
        
        marks = new int[stusize][subsize];
        
        for(n=0;n<stusize;n++)
        {
            System.out.println("Enter Your Name : ");
            name[n] = sc.next();
                  
            for(i=0;i<subsize;i++)
            {
                System.out.println("Enter marks for "+subject[i]+" : ");
                marks[n][i] = sc.nextInt();
            }
        }
        
        for(n=0;n<stusize;n++)
        {
            System.out.print(name[n]+"\t");
            
                  
            for(i=0;i<subsize;i++)
            {
                System.out.print(marks[n][i]+"\t");
                
            }
            System.out.println();
        }
    }
    
    
}