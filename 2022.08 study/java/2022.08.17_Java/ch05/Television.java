public class Television {
	
	int channel;
	int volume;
	boolean onOff;
	
	void print() { //매개변수 x , 반환 x 출력만하는 메소드
		
		System.out.println("텔레비젼의 체널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
	int getChannel() {
		
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}
