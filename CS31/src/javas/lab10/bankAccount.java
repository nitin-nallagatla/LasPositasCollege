package javas.lab10;

public class bankAccount {
	
	// Initializes all necessary class variables.
	public double balance;
	public double interestAnnual;
	public int numberOfDeposits;
	public int numberOfWithdrawals;
	public double serviceCharges;
	
	// Constructor that sets values.
	public bankAccount(double accountBalance, double annualInterest) {
		balance = accountBalance;
		interestAnnual = annualInterest;
	}
	
	// Deposit method deposits money.
	public void deposit(double deposit) {
		balance += deposit;
		numberOfDeposits++;
	}
	
	// Withdraw method removes money from balance.
	public void withdraw(double withdraw) {
		balance -= withdraw;
		numberOfWithdrawals++;
		if (numberOfWithdrawals > 4)
			serviceCharges = numberOfWithdrawals - 4;;
		
	}
	
	// Calculates the interest due.
	public void calcInterest() {
		double monthlyInterest = interestAnnual / 12;
		double monthlyInterestDue = balance * monthlyInterest;
		balance += monthlyInterestDue;		
	}
	
	// Monthly process handles all monthly issues.
	public void monthlyProcess() {
		balance -= serviceCharges;
		calcInterest();
		numberOfDeposits = 0;
		numberOfWithdrawals = 0;
		serviceCharges = 0;
	}
	
	
}
