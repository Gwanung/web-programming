
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount ac1 = new BankAccount();
		BankAccount ac2 = new BankAccount();
		
		ac1.deposit(10000);
		System.out.println("ac1 : " +  ac1);
		
		ac1.withdraw(8000);
		System.out.println("ac1 : " +  ac1);
		System.out.println("ac2 : " +  ac2);
		
		ac1.transfer(1000, ac2);
		System.out.println("ac1 : " +  ac1);
		System.out.println("ac2 : " +  ac2);
	}

}
