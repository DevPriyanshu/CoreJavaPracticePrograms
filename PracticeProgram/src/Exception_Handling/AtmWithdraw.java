package Exception_Handling;

import java.util.Scanner;

public class AtmWithdraw 
{
	public static void main(String[] args) 
	{
		int atm_money=15000;
		int account_money=10000;
		int withdraw_amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to WithDraw: ");
		withdraw_amount=sc.nextInt();
		try {
			if(withdraw_amount<=atm_money)
			{
				if(withdraw_amount<=account_money)
				{
					System.out.println("Your Transaction is success ! ");
				}
				else
				{
					throw new AccountBalanceException();
				}
			}
			else
			{
				throw new AtmBalanceExcetion();
			}
		} catch (AccountBalanceException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (AtmBalanceExcetion e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		finally {
			System.out.println("Thank You !");
		}
	}
}
