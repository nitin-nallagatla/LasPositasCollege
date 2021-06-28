package javas.lab10;

public class bankAccountMain {

	public static void main(String[] args) {
		bankAccount b = new bankAccount(100, 1.2);
		savingsAccount s = new savingsAccount(100, 1.2);
		
		// Showing what's in the account.
		s.printMethod();
		System.out.println();
		
		// Testing deposit.
		s.deposit(1.0);
		s.printMethod();
		System.out.println();
		
		// Testing withdraw.
		s.withdraw(85);
		s.printMethod();
		System.out.println();
		
		// Resetting balance.
		s.deposit(200);
		System.out.println();
		
		// Testing service charges.
		s.withdraw(12);
		s.withdraw(12);
		s.withdraw(12);
		s.withdraw(12);
		s.printMethod();
		System.out.println();
		
		// Testing monthly process.
		s.monthlyProcess();
		s.printMethod();
		
	}

}
