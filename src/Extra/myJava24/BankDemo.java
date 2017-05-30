package myJava24;

public class BankDemo {

	public static void main(String[] args) {
		CheckingAccount c =new CheckingAccount(101);
		System.out.println("Depositing $600...");
		c.deposit(600.00);
		try
		{
		System.out.println("\nWithdrawing $100...");
		c.withdraw(100.00);
		System.out.println("\nWithdrawing $600...");
		c.withdraw(300.00);
		}catch(InsufficientFundsException e)
		{
		System.out.println("you are short $"
		+ e.getAmount());
		e.printStackTrace();
		}
	}
}