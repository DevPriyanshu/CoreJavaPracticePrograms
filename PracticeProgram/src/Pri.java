class Pri 
{
    public static void main(String[] args) {
        int num=5,flag=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            flag++;
        }
        if(flag==1)
        {
            System.out.println("Prime:");
        }
        else
        {
            System.out.println("Not Prime:");
        }
    }    
}