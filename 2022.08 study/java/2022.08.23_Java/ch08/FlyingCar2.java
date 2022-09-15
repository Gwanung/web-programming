
class Car{
	int speed;
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class FlyingCar2 extends Car implements flyable{

	@Override
	public void fly() {
		System.out.println("하늘을 날고 있습니다.");
	}
	
	public static void main(String[] args) {
		FlyingCar2 obj = new FlyingCar2();
		obj.setSpeed(100);
		obj.fly();
	}
}
