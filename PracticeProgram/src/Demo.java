class Demo
{
    int a1=5; //INSTACE VARIABLE
    static int a=2; //STATIC VARIABLE
    public void add() {
        int b=2,sum; //LOCAL VARIABLE
        sum=a+b;
        System.out.println("Sum is : "+sum);
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.add();
        System.out.println(+a);
    }
}