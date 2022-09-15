package quiz;

interface controllable{
	void play();
	void stop();
}

class VideoPlayer implements controllable{

	@Override
	public void play() {
		System.out.println("시작");
	}

	@Override
	public void stop() {
		System.out.println("멈춤");
	}
	
	
}

public class Test {

	public static void main(String[] args) {
		VideoPlayer v = new VideoPlayer();
		v.play();
		v.stop();
		
//		controllable c = new VideoPlayer();
//		c.play();
//		c.stop();
	}

}
