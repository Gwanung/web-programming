package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz1 extends JFrame implements ActionListener{
	JPanel p;
	JLabel l;
	JTextField t1,  t2;
	JButton b1, b2;
	Random r = new Random();
	int random = (r.nextInt(100)+1);
	public Quiz1() {
		p = new JPanel();
		l = new JLabel("숫자를 추측하시오: ");
		t1 = new JTextField(15);
		t2 = new JTextField(10);
		b1 = new JButton("다시 한번");
		b2 = new JButton("종료");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		p.add(l, BorderLayout.NORTH);
		p.add(t1, BorderLayout.NORTH);
		p.add(t2, BorderLayout.CENTER);
		p.add(b1, BorderLayout.SOUTH);
		p.add(b2, BorderLayout.SOUTH);
		add(p);
		
		
		
		setTitle("숫자 게임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 200);
	}
	
	public static void main(String[] args) {
		new Quiz1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int data = Integer.parseInt(t1.getText());
		
		if(e.getSource() == b1) {
			if(random > data) {
				t2.setText("너무 낮습니다!");
				t2.setBackground(Color.red);
			}else if(random < data) {
				t2.setText("너무 높습니다!");
				t2.setBackground(Color.red);
			}else if(random == data){
				t2.setText("정답입니다!");
				t2.setBackground(Color.blue);
			}else {
				t2.setText("1~100 범위 밖을 벗어났습니다!");
			}
		}
		
		if(e.getSource() == b2) {
			System.exit(0);
		}
	}

}
