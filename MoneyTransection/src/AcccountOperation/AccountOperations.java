package AcccountOperation;

/*  this class is perform titly-encapsulation Or Encapsulation Operation  */
public class AccountOperations {

	// Encapsulated filed for balance(title encapsulated)
	private double balance;

	// Create AccountOperations constructor to initialize balance
	public AccountOperations(double balance) {
		this.balance = balance;
	}

	// create getter method to gwt value / balance
	public double getBalance() {
		return balance;
	}

	/* Create seatter method for balance */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/*
	 * Create withdrawMethod if amount in lessthan balance then print masseage
	 * Insufficent balance & account number else balance-amount print successfully
	 * withdraw Or remining balance
	 */
	public void withdrawAmount(int amount, int accountNumber) {

		if (amount > balance) {
			System.out.println("Insufficent balance in account :)" + accountNumber);
		} else {
			setBalance(balance - amount);
			System.out.println("Successfully withdrew :)" + amount + " from account: " + accountNumber);
			// print getBalance Method
			System.out.println("Remaining balance: :)" + getBalance());
		}
	}
}
