package multiplepair;


class OrderedPair <K, V>{
	
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public OrderedPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
}


public class OrderedPairTest {

	public static void main(String[] args) {
		
		OrderedPair<String, Integer> p1 = new OrderedPair<String, Integer>("myKey", 123456);
		OrderedPair<String, String> p2 = new OrderedPair<String, String>("Java", "a programming laguage");
		
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
		
		
		
	}

}
