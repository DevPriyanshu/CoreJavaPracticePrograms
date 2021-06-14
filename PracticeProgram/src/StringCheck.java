
class Parents //
{
	protected void hello()
	{
	
	}
	
}
class Child extends Parents
{
	 public void hello() 
	{
		
	}
}
public class StringCheck
{
	public static void main(String[] args) {
		Child c=new Child();
		c.hello();
	}
}

