package box;

public class BoxTest {

	public static void main(String[] args) {
		
		Box<String> b = new Box<String>(); //제너릭 클래스 사용방법
		b.set("Hello World");
		String s  = b.get();
		
		Box<Integer> b2 = new Box<Integer>();
		b2.set(new Integer(10));
		b2.set(10);  //오토박싱
		Integer i = (Integer)b2.get();
		int i2 = b2.get(); //오토 언박싱
		
		
//		b.set(new Integer(10));
//		Integer i = (Integer)b.get();
	}

}
