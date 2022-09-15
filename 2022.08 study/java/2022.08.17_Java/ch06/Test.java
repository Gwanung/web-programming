
class A{
	private int a; // 전용 멤버
	int b;  // 디폴트 멤버
	public int c; // 공용 멤버
}

public class Test {

	public static void main(String[] args) {
		A obj = new A();
//		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
	}

}
