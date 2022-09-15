
public class Manager extends Employee {
	private int bonus;
	
	public Manager(String name, String address, int salary, int rrn, int bouns) {
		super(name, address, salary, rrn);
		this.bonus = bouns;
	}

	void test() {
		System.out.println("name:" + name);
		System.out.println("address:" + address);
		System.out.println("salary:" + salary);
	}
}
