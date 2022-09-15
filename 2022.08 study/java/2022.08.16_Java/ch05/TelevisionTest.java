public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television();
		tv.setChannel(7);
		tv.volume = 9;
		tv.onOff = true;
		
		tv.print();
		System.out.println(tv.getChannel());
//		System.out.println("텔레비젼의 체널은 " + tv.channel + "이고 볼륨은 " + tv.volume + "입니다.");
		
		Television tv2 = new Television();
		tv2.setChannel(9);
		tv2.volume = 12;
		tv2.onOff = true;
		
//		System.out.println("텔레비젼의 체널은 " + tv2.channel + "이고 볼륨은 " + tv2.volume + "입니다.");
		tv2.print();
	}

}

