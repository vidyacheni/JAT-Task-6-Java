package myPackage;
public class Account {
	private int accountnumber;
	private String accountholder;
	private double balance;
	
	public Account()
	{
	this.accountnumber=1;
	this.accountholder="sara";
	this.balance=0.0;
	}
	public Account(String nam,double bal)
	{
	 this.accountnumber = 2;
	 this.accountholder=nam;
	 this.balance=bal;
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
			System.out.println("DENIED: Insufficient funds, dear " + accountholder + "!");
		else
			{
			balance = balance - amount;
			System.out.println("SUCCESS: You withdrew $" + amount + ". Your new balance: $" + balance);
			}
	}
	public void deposit(double amount)
	{
        System.out.println("\nDepositing $" + amount + " into " + accountholder + "'s account...");
		if(amount>0)
		{
	        balance += amount;
	        System.out.println("TA-DA! Deposit successful! New balance: $" + balance);
	    } else 
	    	System.out.println("ERROR: Invalid deposit amount! Please deposit a positive value.");
	}
	public void checkBalance() 
	{
		System.out.println("\n " + accountholder + ", your current balance is: $" + balance);
	}
	public static void main(String[] args) {
		Account acc1 = new Account("Meera", 100);
        Account acc2 = new Account("Sarah", 50);

        acc1.checkBalance();
        acc1.deposit(200);
        acc1.withdraw(50);
        acc1.withdraw(500);

        acc2.checkBalance();
        acc2.withdraw(30);

	}

}
