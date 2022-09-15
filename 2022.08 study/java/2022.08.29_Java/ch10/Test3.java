
public class Test3 {

	public static void main(String[] args) {
		int num;
		try {
			num = Integer.parseInt("ABC");
		} catch (NumberFormatException e) {
			System.out.println("예외 발생");
			e.printStackTrace(); 	 
		}
	}
	
}
