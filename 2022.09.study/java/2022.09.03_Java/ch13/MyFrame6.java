import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame6 extends JFrame{

	JPanel p = new JPanel();
	JLabel labels[] = new JLabel[30];

	public MyFrame6() {
		
		p.setLayout(null);
		p.setBackground(Color.yellow);
		for(int i=0; i<labels.length; i++) {
			labels[i] = new JLabel("" + i);
			int x = (int) (Math.random()*500)+1;
			int y = (int) (Math.random()*300)+1;
			labels[i].setForeground(Color.MAGENTA);
			labels[i].setLocation(x, y);
			labels[i].setSize(20 , 20);
			p.add(labels[i]);
		}
		
		
		add(p);
		setSize(500, 300);
		setTitle("난수 발생기");
		setVisible(true);
	}
			
	public static void main(String[] args) {
		new MyFrame6();
	}

}
