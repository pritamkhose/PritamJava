package ExceptionLearn;

public class UserDefinedException {
	 private double balance;
	   private int number;
	   
	   public UserDefinedException(int number)
	   {
	      this.number = number;
	   }
	   
	   public void deposit(double amount)
	   {
	      balance += amount;
	   }
	   
	   public void withdraw(double amount) throws InsufficientFundsException
	   {
	      if(amount <= balance)
	      {
	         balance -= amount;
	      }
	      else
	      {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
	   
	   public double getBalance()
	   {
	      return balance;
	   }
	   
	   public int getNumber()
	   {
	      return number;
	   }

}
