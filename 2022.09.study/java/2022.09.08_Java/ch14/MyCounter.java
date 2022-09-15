import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyCounter extends JFrame implements ActionListener{
	
	JLabel l1, l2;
	private int count = 0;
	
	public MyCounter() {
		JPanel p = new JPanel();
		l1 = new JLabel("Counter");
		p.add(l1);
		l2 = new JLabel(" " + count);
		
		l2.setFont(new Font("serif", Font.BOLD | Font.ITALIC, 100));  //이름, 스타일, 폰트크기 순으로 매개변수 값이 들어감
		p.add(l2);
		JButton b = new JButton("카운터 증가");
		b.addActionListener(this);
		p.add(b);
		add(p);
		
		setSize(300, 200);
		setTitle("카운터 증가");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		l2.setText(count + "");
	}
	
	
	public static void main(String[] args) {
		new MyCounter();
	}


}
