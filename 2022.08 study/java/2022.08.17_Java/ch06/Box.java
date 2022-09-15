
public class Box {


	int width, length, height, volume;
	
	Box(int w, int l, int h){
		this.width = w;
		this.length = l;
		this.height = h;
		this.volume = w* l* h;
	}
	
	boolean isSameBox(Box box2) {
		
		if(volume == box2.volume)
			return true;
		else
			return false;
	}

	Box whosLargest(Box box1, Box box2) {
		if(box1.volume > box2.volume)
			return box1;
		else
			return box2;
	}
	
	@Override
	public String toString() {
		return "Box [width=" + width + ", length=" + length + ", height=" + height + ", volume=" + volume + "]";
	}
}
