import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChangeTemperature extends JFrame implements ActionListener{
	JLabel l1, l2;
	JPanel p;
	JTextField t1, t2;
	JButton b;
	double f, c;
	double change1, change2;

	public ChangeTemperature() {
		 p = new JPanel();
		 l1 = new JLabel("화씨온도");
		 t1 = new JTextField(15);
		 l2 = new JLabel("섭씨온도");
		 t2 = new JTextField(15);
		 b = new JButton("확인");
		 b.addActionListener(this);
		 
		 p.add(l1);
		 p.add(t1);
		 p.add(l2);
		 p.add(t2);
		 p.add(b);
		 add(p);
		 
		 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setTitle("온도 변환기");
		 
		 
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String num1 = t1.getText();
		int f = Integer.parseInt(num1);
		double c = 5/9.0*(f-32);
		t1.setText(c + "");
		
		
	}
	
	public static void main(String[] args) {
		new ChangeTemperature();
	}


}
