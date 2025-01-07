package AcccountOperation;

import java.util.Scanner;

/*
 * using Loop: The while (true) loop ensures the program runs continuously until the user decides to exit.
 * Input Handling:The user inputs either a numeric option (1, 2, or 3) or "exit".
 * If the user types "exit", the loop breaks, and the program ends.
 * Assumption:It assumes that the user will enter valid numeric input when choosing an option. For invalid options, a simple message is shown.
 */
public class Main {
	public static void main(String[] args) {

		// scanner object to accept input form user
		Scanner scanner = new Scanner(System.in);

		// Initialize balances for testing
		AccountOperations account = new AccountOperations(20000);
		ATMOperations atm = new ATMOperations(20000);
		CSCCenterAccountOperation csc = new CSCCenterAccountOperation(20000);

		System.out.println("Welcome To Our Transection");
		while (true) {
			// Display options
			System.out.println("\nChoose withdrawal option:");
			System.out.println("1. Account Number");
			System.out.println("2. ATM Number");
			System.out.println("3. Aadhaar Number");
			System.out.println("Type 'exit' to quit.");

			/* Read user input */
			String input = scanner.next();

			// creat if statment using .equalsIgnoreCase()
			if (input.equalsIgnoreCase("exit")) {
				System.out.println("Exiting... Thank you!");
				break; // Exit the loop
			}

			// Assuming the user enters valid numeric input or its covert fully intiger type
			int choice = Integer.parseInt(input);

			if (choice == 1) {
				System.out.print("Enter Account Number: ");
				int accountNumber = scanner.nextInt();
				System.out.print("Enter amount to withdraw: ");
				int accountAmount = (int) scanner.nextDouble();
				account.withdrawAmount(accountNumber, accountAmount);

			} else if (choice == 2) {
				System.out.print("Enter ATM Number: ");
				int atmNumber = scanner.nextInt();
				System.out.print("Enter amount to withdraw: ");
				// Using casting int to double
				int atmAmount = (int) scanner.nextDouble();
				atm.withdrawAmount(atmNumber, atmAmount);

			} else if (choice == 3) {
				System.out.print("Enter Aadhaar Number: ");
				int aadhaarNumber = scanner.nextInt();
				System.out.print("Enter amount to withdraw: ");
				double aadhaarAmount = scanner.nextDouble();
				csc.withdrawAmount(aadhaarNumber, aadhaarAmount);

			} else {
				System.out.println("Invalid option! Please select a valid option.");
			}
		}
	}
}
