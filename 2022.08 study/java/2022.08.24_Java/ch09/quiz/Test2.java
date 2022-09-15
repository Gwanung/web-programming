package quiz;

interface controllable{
	void play();
	void stop();
}

public abstract class Test2 implements controllable{

	public static void main(String[] args) {
		
		Test2 t = new Test2() {
			public void play(){
				System.out.println("ㅇ");
			}
			public void stop() {
				System.out.println("x");
			}
		};
		
		t.play();
		t.stop();
	}
	
}
