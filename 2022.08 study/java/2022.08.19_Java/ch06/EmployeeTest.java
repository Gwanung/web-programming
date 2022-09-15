
public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj = new Employee("홍길동", 1);
		Employee obj2 = new Employee("김철수", 2);
		Employee obj3 = new Employee("김영희", 3);
		

		System.out.println("현재의 직원수 =" + Employee.getCount());
	}

}
