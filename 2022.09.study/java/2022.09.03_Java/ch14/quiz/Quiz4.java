package quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz4 extends JFrame implements ActionListener{
	private JPanel p;
	private JLabel l;
	private JLabel count_l;
	private JButton b;
	
	public Quiz4() {
		p = new JPanel();
		l = new JLabel("Counter");
		count_l = new JLabel("0");
		b = new JButton("카운터 증가");
		b.addActionListener(this);
		p.add(l);
		p.add(count_l);
		p.add(b);
		add(p);
		setTitle("My Counter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b) {
			int count = Integer.parseInt(count_l.getText());
			count += 1;
			count_l.setText(String.valueOf(count));
		}
	}
	public static void main(String[] args) {
		new Quiz4();
	}


}
