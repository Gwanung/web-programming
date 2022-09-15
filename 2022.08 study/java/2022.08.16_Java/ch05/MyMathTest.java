public class MyMathTest {

	public static void main(String[] args) {
		Mymath obj = new Mymath();
		int sum;
		sum = obj.add(2, 3);
		System.out.println("2와 3의 합은 : " + sum);
		System.out.println(obj.square(10));
		System.out.println(obj.square(3.5));
		
		
	}

}
