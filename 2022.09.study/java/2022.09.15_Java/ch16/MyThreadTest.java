class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>=0; i--)
			System.out.print(i + " ");
	}
}

public class MyThreadTest {

	public static void main(String[] args) {
		Thread t = new MyThread();  //쓰레드 사용 1번째 방법
		t.start();
	}

}
