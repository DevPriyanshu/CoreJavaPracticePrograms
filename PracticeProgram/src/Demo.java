
public class Demo 
{
	private String emp_name;
	private  int age;
	
	public Demo(String emp_name,int age)
	{
		this.emp_name=emp_name;
		this.age=age;
	}
	public static void main(String[] args) 
	{
		Demo d=new Demo("priyanshu", 22);
		System.out.println("name: "+d.emp_name+ " " +"age: " +d.age);
	}
}
