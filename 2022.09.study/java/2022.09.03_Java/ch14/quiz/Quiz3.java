package quiz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz3 extends JFrame implements ActionListener{

	JPanel p;
	JButton button1, button2;
	
	public Quiz3() {
		
		p = new JPanel();
		button1 = new JButton("노란색");
		button2 = new JButton("핑크색");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		
		
		p.add(button1);
		p.add(button2);
		add(p);
		
		setSize(300, 150);
		setTitle("이벤트 예제");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				p.setBackground(Color.yellow);
			}else if(e.getSource() == button2) {
				p.setBackground(Color.pink);
			}
	}
	
	
	public static void main(String[] args) {
		new Quiz3();
	}

}
