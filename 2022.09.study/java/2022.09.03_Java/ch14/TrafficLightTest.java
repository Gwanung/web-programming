import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


class MyPanel1 extends JPanel implements ActionListener{
	
	private int light_number = 0;
	
	MyPanel1(){
		setLayout(new BorderLayout());
		
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
	}  //MyPanel1
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100,  100, 100);
		g.drawOval(100, 200,  100, 100);
		g.drawOval(100, 300,  100, 100);  //테두리 검정색
		if(light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100, 100, 100, 100);
		}else if(light_number == 1) {
			g.setColor(Color.green);
			g.fillOval(100, 200,  100, 100);  //신호등에 맞는 색을 그려넣어줌 
		}else {
			g.setColor(Color.yellow);
			g.fillOval(100, 300,  100, 100);
		}
	}//paintComponent
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(++light_number >= 3) {
			light_number = 0;   //값을 증가시키다가 3이상이 되면 값을 초기화해줌!
		}
		repaint();
	} 
	
}



public class TrafficLightTest extends JFrame {
	
	public TrafficLightTest() {
		add(new MyPanel1());
		setTitle("신호등");
		setSize(300, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TrafficLightTest();
	}

}
