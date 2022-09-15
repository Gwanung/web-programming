package date;

public class Employee {
	private Date birthDate;
	private String name;
	
	public Employee(Date birthDate, String name) {
		super();
		this.birthDate = birthDate;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Employee [birthDate=" + birthDate + ", name=" + name + "]";
	}
	
	
}
