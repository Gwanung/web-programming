
public class TvTest {

	public static void main(String[] args) {
		Tv t = new Tv(100, 0);
		System.out.println("CH:" + t.getChannel() + "VOL:" + t.getVolume());
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:" + t.getChannel() + "VOL:" + t.getVolume());
		
		t.volume = 100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:" + t.getChannel() + "VOL:" + t.getVolume());
	}

}
