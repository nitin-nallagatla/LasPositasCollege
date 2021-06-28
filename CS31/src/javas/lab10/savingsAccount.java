package javas.lab10;

public class savingsAccount extends bankAccount {

	boolean activity;

	// Constructor.
	public savingsAccount(double accountBalance, double annualInterest) {
		super(accountBalance, annualInterest);

	}

	// Subclass withdraw that checks activity.
	public void withdraw(double toBeDrawn) {
		activityChecker();
		if (activity != false) {
			super.withdraw(toBeDrawn);
		}
		else
			System.out.println("Raise your balance above $25 to reactivate your account. You cannot withdraw until this action is performed.");

	}

	// Subclass deposit.
	public void deposit(double toBeAdded) {

			super.deposit(toBeAdded);
		
	}

	// Subclass monthly process method.
	public void monthlyProcess() {
		
		if (super.numberOfWithdrawals > 4) {
			
			super.serviceCharges = super.numberOfWithdrawals - 4;
		}
		
		super.monthlyProcess();

		activityChecker();
	}

	// Activity checker method tests for account status.
	public void activityChecker() {
		if (super.balance >= 25)
			activity = true;
		else
			activity = false;
	}
	
	// Method to display information. 
	public void printMethod() {
		System.out.println("Balance: $" + balance);
		System.out.println("Interest: " + String.format("%.2f", ((interestAnnual - 1) * 100)) + "%");
		System.out.println("Deposits: " + numberOfDeposits);
		System.out.println("Withdrawals: " + numberOfWithdrawals);
		System.out.println("Serivce Charges: $" + serviceCharges);
	}

}
