
public class BankAccount {
	String owner;
	int accountNumber;
	int balance;
	
	void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}

	public void transfer(int amount, BankAccount otherAccount) {
		this.withdraw(amount);
		otherAccount.deposit(amount);
	}
	
	@Override
	public String toString() {
		return "현재 잔액은 " + balance + "입니다.";
	}
}