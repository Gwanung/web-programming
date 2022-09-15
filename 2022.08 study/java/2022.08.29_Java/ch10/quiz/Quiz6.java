package quiz;

import java.util.ArrayList;

class Student{
	
	private String name;
	private String address;
	private String number;
	
	public Student(String name, String address, String number) {
		super();
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}

public class Quiz6 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> address = new ArrayList<String>();
		ArrayList<String> number = new ArrayList<String>();
		
		name.add("홍길동");
		address.add("주소1");
		number.add("1234");
		
		name.add("고길동");
		address.add("주소2");
		number.add("4567");
		
		name.add("주길동");
		address.add("주소3");
		number.add("7890");
		
		
//		for(int i =0; i<list.size(); i++) 
//			list.add(new Student(name.get(i), address.get(i), number.get(i)));
//			
//		System.out.println(list.get(0).getName() + list.get(1).getAddress() + list.get(2).getNumber());
//		
		
		
		
	}

}
