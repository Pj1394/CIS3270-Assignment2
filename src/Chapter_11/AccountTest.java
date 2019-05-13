package Chapter_11;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(1122, 20200);
		SavingsAccount savings = new SavingsAccount(1044, 20500);
		CheckingAccount checking = new CheckingAccount(1032, 2000, -20);
		// Set annual interest rate of 4.5%
		account.setAnnualInterestRate(4.5);
		savings.setAnnualInterestRate(4.5);
		checking.setAnnualInterestRate(4.5);

		// Withdraw $2,500
		account.withdraw(2500);
		savings.withdraw(2700);
		checking.withdraw(2500);

		// Deposit $3,000
		account.deposit(3000);
		savings.deposit(30000);
		checking.deposit(1000);

		// Invoke toString methods and print
		System.out.println(account.toString());
		System.out.println(savings.toString());
		System.out.println(checking.toString());
	}
}
