package car;

public class AutoCarTest {

	public static void main(String[] args) {
		AutoCar obj = new AutoCar();
		obj.start();
		obj.setSpeed(30);
		obj.turn(15);
		obj.stop();
		
//		OperateCar obj2 = new AutoCar();   // 위와 같음!
//		obj2.start();
//		obj2.setSpeed(30);
//		obj2.turn(15);
//		obj2.stop();
	}

}
