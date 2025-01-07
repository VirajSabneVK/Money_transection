package AcccountOperation;

/*Create ATMOperations Class using Constructor , Super Keyword 
 * Inheritance And Method Overloading Concept
*/
public class ATMOperations extends AccountOperations {

	// perform Constructor operation using super keyword
	public ATMOperations(double initialBalance) {
		// using super keyword Inheriting balance form the parent class
		super(initialBalance);
	}

	/*
	 * Create withdraw method using overloading operation passing three arguments
	 */
	public void whithdrwAmount(double amount, int atmNumber, boolean isATM) {

		// If Amount is lessthenCurrent Balance Then Print Insufficient balance
		if (amount > getBalance()) {
			System.out.println("Insufficient balance for ATM withdrawal (ATM No: " + atmNumber + ")");
		} else {
			System.out.println("Successfully withdrew " + amount + " from ATM (ATM No: " + atmNumber + ")");

			// Access amount using get Balance Method And Substract Current Amount
			System.out.println("Remaining balance: " + (getBalance() - amount));
		}
	}
}
