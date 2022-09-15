
public class Television implements RemoteControl {
	boolean onoff = false;
	
	@Override
	public void turnOn() {
		onoff = true;
	}

	@Override
	public void turnOff() {
		onoff = false;
	}

}
