
public class BoxTest {

	public static void main(String[] args) {
		Box b1 = new Box(10, 20, 50);
		Box b2 = new Box(10, 30, 30);
		Box b3 = new Box(10, 30, 30);
		
//		Box largest  = b2.whosLargest(b1, b2);
//		System.out.println(largest);
		
		boolean test = b1.isSameBox(b2);
		System.out.println("b1 == b2 :"  + test);
	}

}
