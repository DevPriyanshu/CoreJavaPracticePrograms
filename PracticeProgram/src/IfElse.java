
public class IfElse {
	public static void main(String[] args) {
		int num=60;
		if(num%3==0)
		{
			System.out.println("Kod");
		}
		else if(num%10==0)
		{
			System.out.println("Nest");
		}
		else if(num%30==0)
		{
			System.out.println("KodNest");
		}
		else
		{
			System.out.println("Sorry No Value Find");
		}
	}
}
