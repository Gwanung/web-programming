import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label;
	
 	CountDownTest() {
		setTitle("카운트 다운");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("Start");
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);
		(new Mythread()).start();
		setVisible(true);
	}
 	
 	class Mythread extends Thread{
 		@Override
 		public void run() {
 			for(int i=10; i>=0; i--){
 				try {
					Thread.sleep(1000);  //1초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
 				label.setText(i + "");
 			}// end for
 		}// end run()
 	}// end Mythread
	public static void main(String[] args) {
		new CountDownTest();
		
	}

}
