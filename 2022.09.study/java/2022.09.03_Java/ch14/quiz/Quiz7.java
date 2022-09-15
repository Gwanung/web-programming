package quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz7 extends JFrame implements ActionListener{
	JPanel p;
	JLabel l;
	JLabel l2;
	
	public Quiz7() {
		p = new JPanel();
		l = new JLabel("Don't cry before you are hurt");
		l2 = new JLabel("다치기도 전에 울지말라.");
		
		p.add(l);
		add(p);
		
		setTitle("한글 영문 변환");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 70);
		
		l.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource() == l2) {
					p.add(l);
					add(p);
				}
				repaint();
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				if(e.getSource() == l) {
					p.add(l2);
					add(p);
				}
				repaint();
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
	}
	
	
	
	public static void main(String[] args) {
		new Quiz7();
	}




}
