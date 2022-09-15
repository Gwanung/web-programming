package quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Quiz2 extends JFrame {
	
	private JPanel p;
	private TextField text;
	private TextField text2;
	private JButton button[];
	private String date[] = {"ROCK", "PAPER", "SCISSOR"};
	private int r;
	private String ra;
	
	public Quiz2() {
		p = new JPanel();
		text = new TextField(25);
		text2 = new TextField(25);
		button = new JButton[3];
		r = (int)Math.random()*3;
		ra = date[r]; 
		p.setLayout(new GridLayout(0, 3));
		for(int i=0; i<button.length; i++) {
			button[i]  = new JButton(date[i]);
			p.add(button[i]);
			
			if(ra.equals(button[0])) {
				if(r == 0) 
					text2.setText("비겼습니다.");
				else if(r == 1)
					text2.setText("");
			
		}
		
		
		text.setText("아래의 버튼 중에서 하나를 클릭하시오!");
		add(text, BorderLayout.NORTH);
		add(p, BorderLayout.CENTER);
		add(text2, BorderLayout.SOUTH);
		
		setTitle("가위바위보");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 300);
		
		
			}
	}
		
	
	public static void main(String[] args) {
		new Quiz2();
	}

}
