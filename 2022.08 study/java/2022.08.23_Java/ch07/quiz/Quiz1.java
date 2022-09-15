package quiz;

class Car{
	
	int gasolineGauge;
	
	  Car(int oil){
		 gasolineGauge = oil;
	}
}

class HybridCar extends Car{

	int electricGauge;
	
	HybridCar(int oil, int ele) {
		super(oil);
		electricGauge = ele;
	}
}

class HybridWaterCar extends HybridCar{
	
	int waterGauge;

	HybridWaterCar(int oil, int ele, int wat) {
		super(oil, ele);
		waterGauge = wat;
	}
	
	public void showCurrentGauge(){
		System.out.println("잔여가솔린: " + gasolineGauge);
		System.out.println("잔여전기량: " + electricGauge);
		System.out.println("잔여워터량: " + waterGauge);
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		HybridWaterCar hwCar1 = new HybridWaterCar(4, 2, 3);
		hwCar1.showCurrentGauge();
		
		HybridWaterCar hwCar2 = new HybridWaterCar(9, 5, 7);
		hwCar2.showCurrentGauge();
	}

}
