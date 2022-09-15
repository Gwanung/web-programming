public class Car {
	String color = "red";
	int gear = 2;
	int speed = 80;
	
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed  += 10;
	}
	void speedDown() {
		speed -= 10;
	}
	
	@Override
	public String toString() {
		return "Car [color=" + color + ", gear=" + gear + ", speed=" + speed + "]";
	}

	void print(){
		System.out.println("색상: " + color);
		System.out.println("현재 기어: " + gear);
		System.out.println("현재 속도: " + speed + "km/h");
	}
}
