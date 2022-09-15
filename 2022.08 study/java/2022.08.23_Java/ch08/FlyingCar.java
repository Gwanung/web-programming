
interface Drivable{
	void drive();
}
interface flyable{
	void fly();
}


public class FlyingCar implements Drivable, flyable{

	@Override
	public void fly() {
		System.out.println("하늘을 날고 있습니다.");
	}

	@Override
	public void drive() {
		System.out.println("운전하고 있습니다.");
	}
	
	public static void main(String[] args) {
		FlyingCar obj = new FlyingCar();
		obj.drive();
		obj.fly();
	}
}
