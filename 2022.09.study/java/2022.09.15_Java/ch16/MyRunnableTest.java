class MyRunnable implements Runnable{
	
	String myName;
	public MyRunnable(String name) {
		myName = name;
	}
	
	@Override
	public void run() {
		for(int i=10; i>=0; i--)
			System.out.print(myName + i + " ");
	}
}

public class MyRunnableTest {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable("A")); // 쓰레드 사용 2번째 방법
		Thread t2 = new Thread(new MyRunnable("B")); 
		t.start();
		t2.start();
	}

}
