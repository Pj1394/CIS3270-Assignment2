
/*
 * Account                           *
*-------------------------------------------------------*
* -id: int                                              *
* -balance: double                                      *
* -annualInterestRate: double                           *
* ---------------------------                           *
* -dateCreated: String                                  *
* +Account()                                            *
* +Account(newid: int, newBalance: double)              *
* +setId(newId: int)                                    *
* +setBalance(newBalance: double)                       *
* +setAnnualInterestRate(newAnnualInterestRate: double) *
* +getId(): int                                         *
* +getBalance(): double                                 *
* +getAnnualInterestRate(): double                      *
* +getDateCreated(): String                             *
* +getMonthlyInterestRate(): double                     *
* +getMonthlyInterest(): double                         *
* +withdraw(amount: double)                             *
* +deposit(amount: double)                              *
 */



package Chapter_9;

import java.util.Date;

public class Account {
	// Data fields
		private int id;
		private double balance;
		private static double annualInterestRate;
		private Date dateCreated;

		
		/** Default Constructor */
		Account() {
			id = 0;
			balance = 0;
			annualInterestRate = 0;
			dateCreated = new Date(); 
		}

		/** account with the specified id and initial balance */
		Account(int newId, double newBalance) {
			id = newId;
			balance = newBalance;
			dateCreated = new Date();
		}

		// Mutator methods Setters
		
		public void setId(int newId) {
			id = newId;
		}

	
		public void setBalance(double newBalance) {
			balance = newBalance;
		}

		
		public void setAnnualInterestRate(double newAnnualInterestRate) {
			annualInterestRate = newAnnualInterestRate;
		}

		// Accessor methods Getters that return set ID,Balance, and Annual IR
	
		public int getId() {
			return id;
		}

		
		public double getBalance() {
			return balance;
		}

	
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

	
		public String getDateCreated() {
			return dateCreated.toString();
		}

		/** Getters that Return monthly interest rate  and Monthly Interest*/
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}

		
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		//Withdraw from account
		public void withdraw(double amount) {
			balance -= amount;
		}

		//Deposit into account
		public void deposit(double amount) {
			balance += amount;
	
	

		}

}