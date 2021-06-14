package constructor;

public class Example 
{
	String name,age;
	public Example(String name, String age)
	{
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println(name+" " +age);
	}
	public static void main(String args[])
	{
		Example ex=new Example("priyanshu","22");
		ex.display();
	}
}
