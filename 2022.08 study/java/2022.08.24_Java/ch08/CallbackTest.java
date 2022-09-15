//import java.awt.event.ActionEvent;
//
//import javax.management.timer.Timer;
//
//interface ActionListener{
//	
//}
//
//class MyClass implements ActionListener{
//	
//}
//
//public class CallbackTest {
//
//	public static void main(String[] args) {
//		ActionListener listener = new MyClass();
//		Timer t = new Timer(1000, listener);
//		Timer t = new Timer(1000, new Actionlistener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("beep");
//			}
//			
//		});
//
//		Timer t3 = new Timer(1000, e->System.out.println("beep"));
//		
//		t3.start();
//		for(int i=0; i<1000; i++) {
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e) {
//				
//			}
//		}
//	}
//	
//
//}
