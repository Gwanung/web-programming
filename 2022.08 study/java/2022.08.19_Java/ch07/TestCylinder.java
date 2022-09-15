public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		System.out.println(obj1.getVolume());
		System.out.println(obj1.getHeight());
		
		Cylinder obj2 = new Cylinder(5, 3);
		System.out.println(obj2.getVolume());
		System.out.println(obj2.getHeight());
	}

}
