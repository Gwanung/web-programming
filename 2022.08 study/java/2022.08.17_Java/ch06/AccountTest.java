
public class AccountTest {

	public static void main(String[] args) {
		Account obj = new Account();
		obj.setName("Tom");
		obj.setBalance(100000);
		
		System.out.println("이름은 " + obj.getName() + "입니다.");
		System.out.println("잔액은 " + obj.getBalance() + "입니다.");
		
	}

}
