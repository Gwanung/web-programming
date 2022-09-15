package quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JLabel label1 = new JLabel("화씨 온도 ");
		JLabel label2 = new JLabel("섭씨 온도 ");
		JTextField text1 = new JTextField(15);
		JTextField text2 = new JTextField(15);
		JButton  button = new JButton("변환");
		

		f.add(p);
		p.add(label1);
		p.add(text1);
		p.add(label2);
		p.add(text2);
		p.add(button);
		
		f.setSize(250, 150);
		f.setTitle("온도변환기");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

		
	}

}
