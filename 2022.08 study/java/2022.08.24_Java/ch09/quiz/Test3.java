package quiz;

public class Test3 {

	public static void main(String[] args) {
		try {
			method1();
			System.out.println(6);
		}catch(Exception e) {  
			System.out.println(7);  // method1 에서 Exception을 예외처리하므로 7 출력
		}
	}
	static void method1() throws Exception {
		try {
			method2();
			System.out.println(1);
		}catch(NullPointerException e) {  // method2 에서 NullPointerException 예외처리하므로  2 출력
			System.out.println(2);
			throw e;
		}catch(Exception e) {
			System.out.println(3);
		}finally {
			System.out.println(4);   // finally try이후 무조건 실행해야함. 4 출력
		}
		System.out.println(5);
	}
	
	static void method2() {
		throw new NullPointerException();
	}
}
