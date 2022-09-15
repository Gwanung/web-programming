public class MyCounter {
	int counter;
	
	MyCounter(){ // 기본 생성자
		counter = 1;
	}
	
	MyCounter(int value){ // 기본 생성자 , 생성자 오버로딩
		counter = value;
	}
	
	public int getCounter() {
		return counter;
	}
	
	int inc(int a) {
		a += 1;
		return a;
	}
	
	void inc(MyCounter ctr) {
		ctr.counter += 1;
		
	}
	
	void inc(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			arr[i] += 1;
		}
	}
}
