package Exception_Handling;

import java.util.Scanner;

public class trhowaccount {

		public static void main(String[] args) throws AccountBalanceException, AtmBalanceExcetion 
		{
			int atm_money=10000;
			int account_money=2000;
			int withdraw_amount;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Amount to WithDraw: ");
			withdraw_amount=sc.nextInt();
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
		}
	}


