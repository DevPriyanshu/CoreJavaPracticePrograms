package constructor;

public class ConstructorDemo 
{
	String name;
	int x;
	int age;
	public ConstructorDemo()
	{
		name = "Priyanshu";
		x = 100;
	}
	
	public ConstructorDemo(String n, int y)
	{
		name = n;
		x = y;
	}
	
	public ConstructorDemo(ConstructorDemo cd)
	{
		name = cd.name;
		x = cd.x;
	}
	public ConstructorDemo(String name,int x,int age)
	{
		this.name=name;
		this.x=x;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("x = "+x);
	}
	
	public static void main(String[] args) 
	{
		//Default
		ConstructorDemo obj = new ConstructorDemo(); //new keyword is used to allocate memory for the object
		obj.display();
		
				
		//Parameterised
		ConstructorDemo obj1 = new ConstructorDemo("Anup", 200); //new keyword is used to allocate memory for the object
		obj1.display();
		
		//copy
		ConstructorDemo obj2 = new ConstructorDemo(obj1); //new keyword is used to allocate memory for the object
		obj2.display();
		
		ConstructorDemo obj3=new ConstructorDemo("construtor",12);
		obj3.display();
	}
}