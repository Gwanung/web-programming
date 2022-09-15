public class Car {
	private String model;
	int speed;
	
	
	public Car(String model) {
		super();
		this.model = model;
	}
	
	

	public void setSpeed(int speed) {
		this.speed = speed;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car car = (Car)obj;
			return this.model.equals(car.model);
		}else {
			return false;
		}
	}



	@Override
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + "]";
	}
	
}
