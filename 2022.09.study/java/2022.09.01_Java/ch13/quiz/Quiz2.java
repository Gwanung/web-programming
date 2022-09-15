package quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JLabel text = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JButton button1 = new JButton("콤보 피자");
		JButton button2 = new JButton("포테이토 피자");
		JButton button3 = new JButton("불고기 피자");
		JLabel text2 = new JLabel("개수");
		JTextField textf = new JTextField(20);
		
		f.add(p1);
		p1.add(p2);
		p1.add(text);
		p2.add(button1);
		p2.add(button2);
		p2.add(button3);
		p2.add(text2);
		p2.add(textf);
		
		f.setSize(400, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}

}
