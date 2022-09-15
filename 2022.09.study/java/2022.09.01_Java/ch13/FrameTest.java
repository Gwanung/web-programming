import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest {

	public static void main(String[] args) {  //Gui  첫 번째 방법  
		JFrame f = new JFrame("Frame Test");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // close 관련 옵션 -> jvm에 남아있는 프로세스까지 정리해주는 코드
		
		f.setVisible(true);
		
	}

}
