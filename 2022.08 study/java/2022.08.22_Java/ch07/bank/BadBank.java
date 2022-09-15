package bank;

public class BadBank extends Bank {
	BadBank(){
		super();
		System.out.println("BadBank()");
	}
	
	double getInterestRate() {
		return 10.0;
	}
}
