package simplepair;

public class SimplePair <T>{
	private T first, second;

	public T getFirst() {
		return first;
	}
	
	public T getSecond() {
		return second;
	}

	public SimplePair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public void setSecond(T second) {
		this.second = second;
	}

	


	
	
}
