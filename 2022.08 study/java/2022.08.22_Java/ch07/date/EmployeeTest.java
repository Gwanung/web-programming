package date;

public class EmployeeTest {

	public static void main(String[] args) {
		Date birth = new Date(1990, 11, 12);
		Employee e = new Employee(birth , "홍길동");
		Employee e2 = new Employee(new Date(1990, 11, 12) , "홍길동");
		System.out.println(e);
		System.out.println(e2);
	}

}
