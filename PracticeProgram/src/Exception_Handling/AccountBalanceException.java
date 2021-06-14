package Exception_Handling;

public class AccountBalanceException extends Exception
{
	public AccountBalanceException() 
	{
		System.out.println("Sorry There is Sufficient Amount in your Account ");
	}
}
