package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz6 extends JFrame implements ActionListener {	

	JPanel p;
	JButton b1;
	JButton b2;
	JLabel num;
	
	public Quiz6() {
		p = new JPanel();
		b1 = new JButton("왼쪽으로 움직임");
		b2 = new JButton("오른쪽으로 움직임");
		num = new JLabel();
		
		p.setLayout(new BorderLayout());
		p.setBackground(Color.yellow);
		num.setSize(300, 150);
		p.setLayout(null);
		p.add(num, BorderLayout.NORTH);
		p.add(b1, BorderLayout.SOUTH);
		p.add(b2, BorderLayout.SOUTH);
		add(p);
		setTitle("박스 전환하기");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	} // Quiz6()
	
//	p.add
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new Quiz6();
	}


}
