class Student //Encapsulation
{
    private String name;
    public void setName(String n)
    {
        name = n;
    }
    public String getName()
    {
        return name;
    }
}
class College
{
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Priyanshu");
        System.out.println(s.getName());
    }
}