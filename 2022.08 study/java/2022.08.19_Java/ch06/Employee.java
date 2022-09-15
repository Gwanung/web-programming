
public class Employee {
	String name;
	double salary;
	static int count =0;
	public Employee(String n, double s) {
		
		super();
		this.name = n;
		this.salary = s;
		count ++;
	}
	
	public static int getCount() {
		return count;
	}
	
	
}
