

public class UnaryOperator {

	public static void main(String[] args) {
		int x = 1;
		int y = 1;
		
		int nextx = ++x;  //전위연산자
		int nexty = y++;  //후위연산자
		
//		System.out.println("nextx의 값은" + nextx);
//		System.out.println("nexty의 값은" + nexty);
//		System.out.println("x의 값은" + x);
//		System.out.println("y의 값은" + y);
		
		System.out.printf("x=%d",x); //%d의 값에 콤마 뒤에있는 값이 들어감.
		System.out.printf("y=%d",y); 
		System.out.printf("nextx=%d",nextx);
		System.out.printf("nexty=%d",nexty);
	}

}
