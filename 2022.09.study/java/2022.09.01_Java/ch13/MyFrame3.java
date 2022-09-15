import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame3 extends JFrame {
	
	public MyFrame3() {
		
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel; 
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER));   // center 가 default값
//		panel.setLayout(new FlowLayout(FlowLayout.LEADING));
		
		
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("LongButton5"));
		add(panel);
		pack();  
		setVisible(true);
		
	}
}
