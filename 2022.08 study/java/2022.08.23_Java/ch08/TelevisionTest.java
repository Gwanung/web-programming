
public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.turnOn();
		tv.turnOff();
		
		
//		RemoteControl r = new Television();
//		r.turnOn();
//		r.turnOff();
		
		RemoteControl r2 = new RemoteControl() {   //익명 클래스
			
			@Override
			public void turnOn() {
				System.out.println("turn On");
			}
			
			@Override
			public void turnOff() {
				System.out.println("turn Off");
			}
		};
		r2.turnOn();
		r2.turnOff();
	}

}
