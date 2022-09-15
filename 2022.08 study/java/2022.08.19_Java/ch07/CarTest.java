
public class CarTest {

	public static void main(String[] args) {
		Car firstCar = new Car("HMW520");
		Car secondCar = new Car("HMW520");
		
		if(firstCar.equals(secondCar))  // 다른 주소를 각각 참조 하고 있음! equals
			System.out.println("동일한 차종");
		else
			System.out.println("다른 차종");
		
	}

}
