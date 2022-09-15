package quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz3 {

	
	public static void main(String[] args) {
		
		String arr[][] = {{"Backspace"," "," ", " CE", "C"}, {"7", "8", "9", "/", "sqrt"}, {"4", "5", "6", "x", "%"}, {"1", "2", "3", "-", "1/x"}, {"0", "+/-", ".", "+", "="}};
		Color y = new Color(255, 255, 0);
		Color b = new Color(0, 0, 255);
		Color r = new Color(255, 0, 0);
		
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1.add(new JTextField(40));
		p2.setLayout(new GridLayout(5, 0));
		
		for(int i=0;i<5; i++){
			for(int j=0;j<5; j++) {
				p2.setOpaque(true);
				p2.add(new JButton(arr[i][j]), y);
				
			}
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				p2.setForeground(b);
			}
		}
		
		for(int i=4;i<5; i++) {
			for(int j=4; j<5; j++) {
				p2.setForeground(r);
			}
		}
		
		p.add(p1);
		p.add(p2);
		
		f.add(p);
		f.setSize(600, 250);
		f.setVisible(true);
		
		
	}

}
