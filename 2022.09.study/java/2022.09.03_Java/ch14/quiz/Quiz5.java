package quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz5 extends JFrame implements ActionListener{
	JPanel p1;
	JPanel p2;
	JPanel p3;
	JLabel l;
	JTextField t1;
	JTextField t2;
	JButton b;
	double mile;
	double kill;
	
	public Quiz5() {
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		l = new JLabel("거리를 마일 단위로 입력하시오.");
		b = new JButton("변환");
		b.addActionListener(this);
		t1 = new JTextField(5);
		t2 = new JTextField(20);
		

		p1.add(l);
		p1.add(t1);
		p2.add(b);
		p3.add(t2);
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		setTitle("마일을 킬로미터로 변환");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mile = Double.parseDouble(t1.getText());
		kill = 1.6*mile;
		
		if(e.getSource() == b) {
			t2.setText(t1.getText() + "마일은 " + Double.toString(kill) + "킬로미터 입니다.");
		}
	}
	
	public static void main(String[] args) {
		new Quiz5();
		
	}

}
