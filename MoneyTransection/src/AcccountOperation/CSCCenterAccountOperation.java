package AcccountOperation;

/*
 * Created Class CSCCenterAccountOperation to perform Inheritanc & Overriding operation 
 */
public class CSCCenterAccountOperation extends AccountOperations {

	// perform Constructor operation using super keyword
	public CSCCenterAccountOperation(double initialBalance) {
		
		// using super keyword Inheriting balance form the parent class
		super(initialBalance);
	}

	/*
	 * Create withdrawAmount Method to perform overriding operation using if else
	 * statment & handle Aadhaar-specific logi
	 */
	public void withdrawAmount(int aadhaarNumber, double amount) {

		if (amount > getBalance()) {
			System.out.println("Insufficient balance for Aadhaar withdrawal (Aadhaar No: " + aadhaarNumber + ")");
		} else {
			System.out
					.println("Successfully withdrew " + amount + " using Aadhaar (Aadhaar No: " + aadhaarNumber + ")");
			System.out.println("Remaining balance: " + (getBalance() - amount));
		}
	}
}