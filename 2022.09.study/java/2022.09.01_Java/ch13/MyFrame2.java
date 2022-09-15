import javax.swing.JFrame;

public class MyFrame2 extends JFrame { // Gui  세 번째 방법
	

	public MyFrame2() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MyFrame2();
	}	
}
