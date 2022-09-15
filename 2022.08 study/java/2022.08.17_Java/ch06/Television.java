
public class Television {
	private int channel;
	private int volume;
	private boolean onOff;
	
	Television(int chV, int volV){
		channel = chV;
		volume = volV;
	}
	
	void print() {
		System.out.println("채널은" + channel + "이고 볼륨은" + volume + "입니다.");
	}
}
