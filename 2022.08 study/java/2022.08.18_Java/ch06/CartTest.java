
public class CartTest {

	public static void main(String[] args) {
		Car c1 = new Car("S600", "white", 80);
		Car c2 = new Car("E500", "blue", 20);
		
		int n = Car.getNumberOfCars();
		System.out.println("지금까지 생성된 자동차수 =" + n);
		
	}

}
