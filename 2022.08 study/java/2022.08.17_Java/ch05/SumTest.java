
public class SumTest {

	public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(5, 5));
		System.out.println(s.sum(5, 5.5));
		System.out.println(s.sum(5, 5, 10));
		System.out.println(s.sum(5.0, 5.1, 10.2));
	}

}
